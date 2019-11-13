/*
 * generated by Xtext 2.19.0
 */
grammar InternalWhileDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package esir.comp.cpp.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package esir.comp.cpp.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import esir.comp.cpp.services.WhileDslGrammarAccess;

}

@parser::members {

 	private WhileDslGrammarAccess grammarAccess;

    public InternalWhileDslParser(TokenStream input, WhileDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected WhileDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getProgramFunctionParserRuleCall_0());
			}
			lv_program_0_0=ruleFunction
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"program",
					lv_program_0_0,
					"esir.comp.cpp.WhileDsl.Function");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleFunction
entryRuleFunction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionRule()); }
	iv_ruleFunction=ruleFunction
	{ $current=$iv_ruleFunction.current; }
	EOF;

// Rule Function
ruleFunction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='function'
		{
			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getFunctionAccess().getLCParserRuleCall_1());
		}
		ruleLC
		{
			afterParserOrEnumRuleCall();
		}
		(
			(
				lv_functionName_2_0=RULE_SYMBOL
				{
					newLeafNode(lv_functionName_2_0, grammarAccess.getFunctionAccess().getFunctionNameSYMBOLTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFunctionRule());
					}
					setWithLastConsumed(
						$current,
						"functionName",
						lv_functionName_2_0,
						"esir.comp.cpp.WhileDsl.SYMBOL");
				}
			)
		)
		{
			newCompositeNode(grammarAccess.getFunctionAccess().getLCParserRuleCall_3());
		}
		ruleLC
		{
			afterParserOrEnumRuleCall();
		}
		otherlv_4=':'
		{
			newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getColonKeyword_4());
		}
		{
			newCompositeNode(grammarAccess.getFunctionAccess().getLCParserRuleCall_5());
		}
		ruleLC
		{
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFunctionAccess().getFunctionDefinitionDefinitionParserRuleCall_6_0());
				}
				lv_functionDefinition_6_0=ruleDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFunctionRule());
					}
					set(
						$current,
						"functionDefinition",
						lv_functionDefinition_6_0,
						"esir.comp.cpp.WhileDsl.Definition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		{
			newCompositeNode(grammarAccess.getFunctionAccess().getLCParserRuleCall_7());
		}
		ruleLC
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDefinition
entryRuleDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefinitionRule()); }
	iv_ruleDefinition=ruleDefinition
	{ $current=$iv_ruleDefinition.current; }
	EOF;

// Rule Definition
ruleDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='read'
		{
			newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getReadKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getDefinitionAccess().getLCParserRuleCall_1());
		}
		ruleLC
		{
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDefinitionAccess().getIntputInputParserRuleCall_2_0());
				}
				lv_intput_2_0=ruleInput
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefinitionRule());
					}
					set(
						$current,
						"intput",
						lv_intput_2_0,
						"esir.comp.cpp.WhileDsl.Input");
					afterParserOrEnumRuleCall();
				}
			)
		)
		{
			newCompositeNode(grammarAccess.getDefinitionAccess().getLCParserRuleCall_3());
		}
		ruleLC
		{
			afterParserOrEnumRuleCall();
		}
		otherlv_4='%'
		{
			newLeafNode(otherlv_4, grammarAccess.getDefinitionAccess().getPercentSignKeyword_4());
		}
		{
			newCompositeNode(grammarAccess.getDefinitionAccess().getLCParserRuleCall_5());
		}
		ruleLC
		{
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDefinitionAccess().getBodyCommandsParserRuleCall_6_0());
				}
				lv_body_6_0=ruleCommands
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefinitionRule());
					}
					set(
						$current,
						"body",
						lv_body_6_0,
						"esir.comp.cpp.WhileDsl.Commands");
					afterParserOrEnumRuleCall();
				}
			)
		)
		{
			newCompositeNode(grammarAccess.getDefinitionAccess().getLCParserRuleCall_7());
		}
		ruleLC
		{
			afterParserOrEnumRuleCall();
		}
		otherlv_8='%'
		{
			newLeafNode(otherlv_8, grammarAccess.getDefinitionAccess().getPercentSignKeyword_8());
		}
		{
			newCompositeNode(grammarAccess.getDefinitionAccess().getLCParserRuleCall_9());
		}
		ruleLC
		{
			afterParserOrEnumRuleCall();
		}
		otherlv_10='write'
		{
			newLeafNode(otherlv_10, grammarAccess.getDefinitionAccess().getWriteKeyword_10());
		}
		{
			newCompositeNode(grammarAccess.getDefinitionAccess().getLCParserRuleCall_11());
		}
		ruleLC
		{
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDefinitionAccess().getOutputOutputParserRuleCall_12_0());
				}
				lv_output_12_0=ruleOutput
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefinitionRule());
					}
					set(
						$current,
						"output",
						lv_output_12_0,
						"esir.comp.cpp.WhileDsl.Output");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleInput
entryRuleInput returns [String current=null]:
	{ newCompositeNode(grammarAccess.getInputRule()); }
	iv_ruleInput=ruleInput
	{ $current=$iv_ruleInput.current.getText(); }
	EOF;

// Rule Input
ruleInput returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_VARIABLE_0=RULE_VARIABLE
		{
			$current.merge(this_VARIABLE_0);
		}
		{
			newLeafNode(this_VARIABLE_0, grammarAccess.getInputAccess().getVARIABLETerminalRuleCall_0());
		}
		(
			kw=','
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getInputAccess().getCommaKeyword_1_0());
			}
			this_VARIABLE_2=RULE_VARIABLE
			{
				$current.merge(this_VARIABLE_2);
			}
			{
				newLeafNode(this_VARIABLE_2, grammarAccess.getInputAccess().getVARIABLETerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleOutput
entryRuleOutput returns [String current=null]:
	{ newCompositeNode(grammarAccess.getOutputRule()); }
	iv_ruleOutput=ruleOutput
	{ $current=$iv_ruleOutput.current.getText(); }
	EOF;

// Rule Output
ruleOutput returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_VARIABLE_0=RULE_VARIABLE
		{
			$current.merge(this_VARIABLE_0);
		}
		{
			newLeafNode(this_VARIABLE_0, grammarAccess.getOutputAccess().getVARIABLETerminalRuleCall_0());
		}
		(
			kw=','
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getOutputAccess().getCommaKeyword_1_0());
			}
			this_VARIABLE_2=RULE_VARIABLE
			{
				$current.merge(this_VARIABLE_2);
			}
			{
				newLeafNode(this_VARIABLE_2, grammarAccess.getOutputAccess().getVARIABLETerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleCommands
entryRuleCommands returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommandsRule()); }
	iv_ruleCommands=ruleCommands
	{ $current=$iv_ruleCommands.current; }
	EOF;

// Rule Commands
ruleCommands returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getCommandsAccess().getCommandsCommandParserRuleCall_0_0());
				}
				lv_commands_0_0=ruleCommand
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCommandsRule());
					}
					add(
						$current,
						"commands",
						lv_commands_0_0,
						"esir.comp.cpp.WhileDsl.Command");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=';'
			{
				newLeafNode(otherlv_1, grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0());
			}
			{
				newCompositeNode(grammarAccess.getCommandsAccess().getLCParserRuleCall_1_1());
			}
			ruleLC
			{
				afterParserOrEnumRuleCall();
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCommandsAccess().getCommandsCommandParserRuleCall_1_2_0());
					}
					lv_commands_3_0=ruleCommand
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCommandsRule());
						}
						add(
							$current,
							"commands",
							lv_commands_3_0,
							"esir.comp.cpp.WhileDsl.Command");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		(
			otherlv_4=';'
			{
				newLeafNode(otherlv_4, grammarAccess.getCommandsAccess().getSemicolonKeyword_2());
			}
		)?
	)
;

// Entry rule entryRuleCommand
entryRuleCommand returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommandRule()); }
	iv_ruleCommand=ruleCommand
	{ $current=$iv_ruleCommand.current; }
	EOF;

// Rule Command
ruleCommand returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getCommandAccess().getNopCommandAction_0_0(),
						$current);
				}
			)
			{
				newCompositeNode(grammarAccess.getCommandAccess().getNopCommandParserRuleCall_0_1());
			}
			ruleNopCommand
			{
				afterParserOrEnumRuleCall();
			}
		)
		    |
		{
			newCompositeNode(grammarAccess.getCommandAccess().getWhileCommandParserRuleCall_1());
		}
		this_WhileCommand_2=ruleWhileCommand
		{
			$current = $this_WhileCommand_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCommandAccess().getForCommandParserRuleCall_2());
		}
		this_ForCommand_3=ruleForCommand
		{
			$current = $this_ForCommand_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCommandAccess().getIfCommandParserRuleCall_3());
		}
		this_IfCommand_4=ruleIfCommand
		{
			$current = $this_IfCommand_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCommandAccess().getForeachCommandParserRuleCall_4());
		}
		this_ForeachCommand_5=ruleForeachCommand
		{
			$current = $this_ForeachCommand_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCommandAccess().getVarsCommandParserRuleCall_5());
		}
		this_VarsCommand_6=ruleVarsCommand
		{
			$current = $this_VarsCommand_6.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleWhileCommand
entryRuleWhileCommand returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWhileCommandRule()); }
	iv_ruleWhileCommand=ruleWhileCommand
	{ $current=$iv_ruleWhileCommand.current; }
	EOF;

// Rule WhileCommand
ruleWhileCommand returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='while'
		{
			newLeafNode(otherlv_0, grammarAccess.getWhileCommandAccess().getWhileKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getWhileCommandAccess().getLCParserRuleCall_1());
		}
		ruleLC
		{
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWhileCommandAccess().getCondExprParserRuleCall_2_0());
				}
				lv_cond_2_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWhileCommandRule());
					}
					set(
						$current,
						"cond",
						lv_cond_2_0,
						"esir.comp.cpp.WhileDsl.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		{
			newCompositeNode(grammarAccess.getWhileCommandAccess().getLCParserRuleCall_3());
		}
		ruleLC
		{
			afterParserOrEnumRuleCall();
		}
		otherlv_4='do'
		{
			newLeafNode(otherlv_4, grammarAccess.getWhileCommandAccess().getDoKeyword_4());
		}
		{
			newCompositeNode(grammarAccess.getWhileCommandAccess().getLCParserRuleCall_5());
		}
		ruleLC
		{
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWhileCommandAccess().getBodyCommandsParserRuleCall_6_0());
				}
				lv_body_6_0=ruleCommands
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWhileCommandRule());
					}
					set(
						$current,
						"body",
						lv_body_6_0,
						"esir.comp.cpp.WhileDsl.Commands");
					afterParserOrEnumRuleCall();
				}
			)
		)
		{
			newCompositeNode(grammarAccess.getWhileCommandAccess().getLCParserRuleCall_7());
		}
		ruleLC
		{
			afterParserOrEnumRuleCall();
		}
		otherlv_8='od'
		{
			newLeafNode(otherlv_8, grammarAccess.getWhileCommandAccess().getOdKeyword_8());
		}
	)
;

// Entry rule entryRuleForCommand
entryRuleForCommand returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getForCommandRule()); }
	iv_ruleForCommand=ruleForCommand
	{ $current=$iv_ruleForCommand.current; }
	EOF;

// Rule ForCommand
ruleForCommand returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='for'
		{
			newLeafNode(otherlv_0, grammarAccess.getForCommandAccess().getForKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getForCommandAccess().getLCParserRuleCall_1());
		}
		ruleLC
		{
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForCommandAccess().getCondExprParserRuleCall_2_0());
				}
				lv_cond_2_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForCommandRule());
					}
					set(
						$current,
						"cond",
						lv_cond_2_0,
						"esir.comp.cpp.WhileDsl.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		{
			newCompositeNode(grammarAccess.getForCommandAccess().getLCParserRuleCall_3());
		}
		ruleLC
		{
			afterParserOrEnumRuleCall();
		}
		otherlv_4='do'
		{
			newLeafNode(otherlv_4, grammarAccess.getForCommandAccess().getDoKeyword_4());
		}
		{
			newCompositeNode(grammarAccess.getForCommandAccess().getLCParserRuleCall_5());
		}
		ruleLC
		{
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForCommandAccess().getBodyCommandsParserRuleCall_6_0());
				}
				lv_body_6_0=ruleCommands
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForCommandRule());
					}
					set(
						$current,
						"body",
						lv_body_6_0,
						"esir.comp.cpp.WhileDsl.Commands");
					afterParserOrEnumRuleCall();
				}
			)
		)
		{
			newCompositeNode(grammarAccess.getForCommandAccess().getLCParserRuleCall_7());
		}
		ruleLC
		{
			afterParserOrEnumRuleCall();
		}
		otherlv_8='od'
		{
			newLeafNode(otherlv_8, grammarAccess.getForCommandAccess().getOdKeyword_8());
		}
	)
;

// Entry rule entryRuleIfCommand
entryRuleIfCommand returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIfCommandRule()); }
	iv_ruleIfCommand=ruleIfCommand
	{ $current=$iv_ruleIfCommand.current; }
	EOF;

// Rule IfCommand
ruleIfCommand returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='if'
		{
			newLeafNode(otherlv_0, grammarAccess.getIfCommandAccess().getIfKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getIfCommandAccess().getLCParserRuleCall_1());
		}
		ruleLC
		{
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIfCommandAccess().getCondExprParserRuleCall_2_0());
				}
				lv_cond_2_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIfCommandRule());
					}
					set(
						$current,
						"cond",
						lv_cond_2_0,
						"esir.comp.cpp.WhileDsl.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		{
			newCompositeNode(grammarAccess.getIfCommandAccess().getLCParserRuleCall_3());
		}
		ruleLC
		{
			afterParserOrEnumRuleCall();
		}
		otherlv_4='then'
		{
			newLeafNode(otherlv_4, grammarAccess.getIfCommandAccess().getThenKeyword_4());
		}
		{
			newCompositeNode(grammarAccess.getIfCommandAccess().getLCParserRuleCall_5());
		}
		ruleLC
		{
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIfCommandAccess().getThenBodyCommandsParserRuleCall_6_0());
				}
				lv_thenBody_6_0=ruleCommands
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIfCommandRule());
					}
					set(
						$current,
						"thenBody",
						lv_thenBody_6_0,
						"esir.comp.cpp.WhileDsl.Commands");
					afterParserOrEnumRuleCall();
				}
			)
		)
		{
			newCompositeNode(grammarAccess.getIfCommandAccess().getLCParserRuleCall_7());
		}
		ruleLC
		{
			afterParserOrEnumRuleCall();
		}
		(
			otherlv_8='else'
			{
				newLeafNode(otherlv_8, grammarAccess.getIfCommandAccess().getElseKeyword_8_0());
			}
			{
				newCompositeNode(grammarAccess.getIfCommandAccess().getLCParserRuleCall_8_1());
			}
			ruleLC
			{
				afterParserOrEnumRuleCall();
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getIfCommandAccess().getElseBodyCommandsParserRuleCall_8_2_0());
					}
					lv_elseBody_10_0=ruleCommands
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIfCommandRule());
						}
						set(
							$current,
							"elseBody",
							lv_elseBody_10_0,
							"esir.comp.cpp.WhileDsl.Commands");
						afterParserOrEnumRuleCall();
					}
				)
			)
			{
				newCompositeNode(grammarAccess.getIfCommandAccess().getLCParserRuleCall_8_3());
			}
			ruleLC
			{
				afterParserOrEnumRuleCall();
			}
		)?
		otherlv_12='fi'
		{
			newLeafNode(otherlv_12, grammarAccess.getIfCommandAccess().getFiKeyword_9());
		}
	)
;

// Entry rule entryRuleForeachCommand
entryRuleForeachCommand returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getForeachCommandRule()); }
	iv_ruleForeachCommand=ruleForeachCommand
	{ $current=$iv_ruleForeachCommand.current; }
	EOF;

// Rule ForeachCommand
ruleForeachCommand returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='foreach'
		{
			newLeafNode(otherlv_0, grammarAccess.getForeachCommandAccess().getForeachKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getForeachCommandAccess().getLCParserRuleCall_1());
		}
		ruleLC
		{
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForeachCommandAccess().getExpElementExprParserRuleCall_2_0());
				}
				lv_expElement_2_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForeachCommandRule());
					}
					set(
						$current,
						"expElement",
						lv_expElement_2_0,
						"esir.comp.cpp.WhileDsl.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		{
			newCompositeNode(grammarAccess.getForeachCommandAccess().getLCParserRuleCall_3());
		}
		ruleLC
		{
			afterParserOrEnumRuleCall();
		}
		otherlv_4='in'
		{
			newLeafNode(otherlv_4, grammarAccess.getForeachCommandAccess().getInKeyword_4());
		}
		{
			newCompositeNode(grammarAccess.getForeachCommandAccess().getLCParserRuleCall_5());
		}
		ruleLC
		{
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForeachCommandAccess().getExpListExprParserRuleCall_6_0());
				}
				lv_expList_6_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForeachCommandRule());
					}
					set(
						$current,
						"expList",
						lv_expList_6_0,
						"esir.comp.cpp.WhileDsl.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		{
			newCompositeNode(grammarAccess.getForeachCommandAccess().getLCParserRuleCall_7());
		}
		ruleLC
		{
			afterParserOrEnumRuleCall();
		}
		otherlv_8='do'
		{
			newLeafNode(otherlv_8, grammarAccess.getForeachCommandAccess().getDoKeyword_8());
		}
		{
			newCompositeNode(grammarAccess.getForeachCommandAccess().getLCParserRuleCall_9());
		}
		ruleLC
		{
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForeachCommandAccess().getBodyCommandsParserRuleCall_10_0());
				}
				lv_body_10_0=ruleCommands
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForeachCommandRule());
					}
					set(
						$current,
						"body",
						lv_body_10_0,
						"esir.comp.cpp.WhileDsl.Commands");
					afterParserOrEnumRuleCall();
				}
			)
		)
		{
			newCompositeNode(grammarAccess.getForeachCommandAccess().getLCParserRuleCall_11());
		}
		ruleLC
		{
			afterParserOrEnumRuleCall();
		}
		otherlv_12='od'
		{
			newLeafNode(otherlv_12, grammarAccess.getForeachCommandAccess().getOdKeyword_12());
		}
	)
;

// Entry rule entryRuleVarsCommand
entryRuleVarsCommand returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVarsCommandRule()); }
	iv_ruleVarsCommand=ruleVarsCommand
	{ $current=$iv_ruleVarsCommand.current; }
	EOF;

// Rule VarsCommand
ruleVarsCommand returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getVarsCommandAccess().getVariablesVarsParserRuleCall_0_0());
				}
				lv_variables_0_0=ruleVars
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVarsCommandRule());
					}
					set(
						$current,
						"variables",
						lv_variables_0_0,
						"esir.comp.cpp.WhileDsl.Vars");
					afterParserOrEnumRuleCall();
				}
			)
		)
		{
			newCompositeNode(grammarAccess.getVarsCommandAccess().getLCParserRuleCall_1());
		}
		ruleLC
		{
			afterParserOrEnumRuleCall();
		}
		otherlv_2=':='
		{
			newLeafNode(otherlv_2, grammarAccess.getVarsCommandAccess().getColonEqualsSignKeyword_2());
		}
		{
			newCompositeNode(grammarAccess.getVarsCommandAccess().getLCParserRuleCall_3());
		}
		ruleLC
		{
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVarsCommandAccess().getValuesExprsParserRuleCall_4_0());
				}
				lv_values_4_0=ruleExprs
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVarsCommandRule());
					}
					set(
						$current,
						"values",
						lv_values_4_0,
						"esir.comp.cpp.WhileDsl.Exprs");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleNopCommand
entryRuleNopCommand returns [String current=null]:
	{ newCompositeNode(grammarAccess.getNopCommandRule()); }
	iv_ruleNopCommand=ruleNopCommand
	{ $current=$iv_ruleNopCommand.current.getText(); }
	EOF;

// Rule NopCommand
ruleNopCommand returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='nop'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getNopCommandAccess().getNopKeyword());
	}
;

// Entry rule entryRuleVars
entryRuleVars returns [String current=null]:
	{ newCompositeNode(grammarAccess.getVarsRule()); }
	iv_ruleVars=ruleVars
	{ $current=$iv_ruleVars.current.getText(); }
	EOF;

// Rule Vars
ruleVars returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_VARIABLE_0=RULE_VARIABLE
		{
			$current.merge(this_VARIABLE_0);
		}
		{
			newLeafNode(this_VARIABLE_0, grammarAccess.getVarsAccess().getVARIABLETerminalRuleCall_0());
		}
		(
			kw=','
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getVarsAccess().getCommaKeyword_1_0());
			}
			this_VARIABLE_2=RULE_VARIABLE
			{
				$current.merge(this_VARIABLE_2);
			}
			{
				newLeafNode(this_VARIABLE_2, grammarAccess.getVarsAccess().getVARIABLETerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleExprSimple
entryRuleExprSimple returns [String current=null]:
	{ newCompositeNode(grammarAccess.getExprSimpleRule()); }
	iv_ruleExprSimple=ruleExprSimple
	{ $current=$iv_ruleExprSimple.current.getText(); }
	EOF;

// Rule ExprSimple
ruleExprSimple returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='nil'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getExprSimpleAccess().getNilKeyword_0());
		}
		    |
		this_VARIABLE_1=RULE_VARIABLE
		{
			$current.merge(this_VARIABLE_1);
		}
		{
			newLeafNode(this_VARIABLE_1, grammarAccess.getExprSimpleAccess().getVARIABLETerminalRuleCall_1());
		}
		    |
		this_SYMBOL_2=RULE_SYMBOL
		{
			$current.merge(this_SYMBOL_2);
		}
		{
			newLeafNode(this_SYMBOL_2, grammarAccess.getExprSimpleAccess().getSYMBOLTerminalRuleCall_2());
		}
		    |
		(
			kw='('
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_3_0());
			}
			(
				kw='cons'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getExprSimpleAccess().getConsKeyword_3_1_0());
				}
				    |
				kw='list'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getExprSimpleAccess().getListKeyword_3_1_1());
				}
			)
			{
				newCompositeNode(grammarAccess.getExprSimpleAccess().getLExprParserRuleCall_3_2());
			}
			this_LExpr_6=ruleLExpr
			{
				$current.merge(this_LExpr_6);
			}
			{
				afterParserOrEnumRuleCall();
			}
			kw=')'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_3_3());
			}
		)
		    |
		(
			kw='('
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_4_0());
			}
			(
				kw='hd'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getExprSimpleAccess().getHdKeyword_4_1_0());
				}
				    |
				kw='tl'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getExprSimpleAccess().getTlKeyword_4_1_1());
				}
			)
			{
				newCompositeNode(grammarAccess.getExprSimpleAccess().getLCParserRuleCall_4_2());
			}
			this_LC_11=ruleLC
			{
				$current.merge(this_LC_11);
			}
			{
				afterParserOrEnumRuleCall();
			}
			{
				newCompositeNode(grammarAccess.getExprSimpleAccess().getExprParserRuleCall_4_3());
			}
			this_Expr_12=ruleExpr
			{
				$current.merge(this_Expr_12);
			}
			{
				afterParserOrEnumRuleCall();
			}
			kw=')'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_4_4());
			}
		)
		    |
		(
			kw='('
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_5_0());
			}
			this_SYMBOL_15=RULE_SYMBOL
			{
				$current.merge(this_SYMBOL_15);
			}
			{
				newLeafNode(this_SYMBOL_15, grammarAccess.getExprSimpleAccess().getSYMBOLTerminalRuleCall_5_1());
			}
			{
				newCompositeNode(grammarAccess.getExprSimpleAccess().getLExprParserRuleCall_5_2());
			}
			this_LExpr_16=ruleLExpr
			{
				$current.merge(this_LExpr_16);
			}
			{
				afterParserOrEnumRuleCall();
			}
			kw=')'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_5_3());
			}
		)
	)
;

// Entry rule entryRuleLExpr
entryRuleLExpr returns [String current=null]:
	{ newCompositeNode(grammarAccess.getLExprRule()); }
	iv_ruleLExpr=ruleLExpr
	{ $current=$iv_ruleLExpr.current.getText(); }
	EOF;

// Rule LExpr
ruleLExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getLExprAccess().getExprParserRuleCall());
		}
		this_Expr_0=ruleExpr
		{
			$current.merge(this_Expr_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)+
;

// Entry rule entryRuleExprs
entryRuleExprs returns [String current=null]:
	{ newCompositeNode(grammarAccess.getExprsRule()); }
	iv_ruleExprs=ruleExprs
	{ $current=$iv_ruleExprs.current.getText(); }
	EOF;

// Rule Exprs
ruleExprs returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getExprsAccess().getExprParserRuleCall_0());
		}
		this_Expr_0=ruleExpr
		{
			$current.merge(this_Expr_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		(
			kw=','
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getExprsAccess().getCommaKeyword_1_0());
			}
			{
				newCompositeNode(grammarAccess.getExprsAccess().getLCParserRuleCall_1_1());
			}
			this_LC_2=ruleLC
			{
				$current.merge(this_LC_2);
			}
			{
				afterParserOrEnumRuleCall();
			}
			{
				newCompositeNode(grammarAccess.getExprsAccess().getExprParserRuleCall_1_2());
			}
			this_Expr_3=ruleExpr
			{
				$current.merge(this_Expr_3);
			}
			{
				afterParserOrEnumRuleCall();
			}
		)*
	)
;

// Entry rule entryRuleExpr
entryRuleExpr returns [String current=null]:
	{ newCompositeNode(grammarAccess.getExprRule()); }
	iv_ruleExpr=ruleExpr
	{ $current=$iv_ruleExpr.current.getText(); }
	EOF;

// Rule Expr
ruleExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(ruleExprAnd)=>
			{
				newCompositeNode(grammarAccess.getExprAccess().getExprAndParserRuleCall_0());
			}
			this_ExprAnd_0=ruleExprAnd
			{
				$current.merge(this_ExprAnd_0);
			}
			{
				afterParserOrEnumRuleCall();
			}
		)
		    |
		{
			newCompositeNode(grammarAccess.getExprAccess().getExprSimpleParserRuleCall_1());
		}
		this_ExprSimple_1=ruleExprSimple
		{
			$current.merge(this_ExprSimple_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleExprAnd
entryRuleExprAnd returns [String current=null]:
	{ newCompositeNode(grammarAccess.getExprAndRule()); }
	iv_ruleExprAnd=ruleExprAnd
	{ $current=$iv_ruleExprAnd.current.getText(); }
	EOF;

// Rule ExprAnd
ruleExprAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getExprAndAccess().getExprOrParserRuleCall_0());
		}
		this_ExprOr_0=ruleExprOr
		{
			$current.merge(this_ExprOr_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		(
			{
				newCompositeNode(grammarAccess.getExprAndAccess().getLCParserRuleCall_1_0());
			}
			this_LC_1=ruleLC
			{
				$current.merge(this_LC_1);
			}
			{
				afterParserOrEnumRuleCall();
			}
			kw='and'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getExprAndAccess().getAndKeyword_1_1());
			}
			{
				newCompositeNode(grammarAccess.getExprAndAccess().getLCParserRuleCall_1_2());
			}
			this_LC_3=ruleLC
			{
				$current.merge(this_LC_3);
			}
			{
				afterParserOrEnumRuleCall();
			}
			{
				newCompositeNode(grammarAccess.getExprAndAccess().getExprOrParserRuleCall_1_3());
			}
			this_ExprOr_4=ruleExprOr
			{
				$current.merge(this_ExprOr_4);
			}
			{
				afterParserOrEnumRuleCall();
			}
		)*
	)
;

// Entry rule entryRuleExprOr
entryRuleExprOr returns [String current=null]:
	{ newCompositeNode(grammarAccess.getExprOrRule()); }
	iv_ruleExprOr=ruleExprOr
	{ $current=$iv_ruleExprOr.current.getText(); }
	EOF;

// Rule ExprOr
ruleExprOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getExprOrAccess().getExprNotParserRuleCall_0());
		}
		this_ExprNot_0=ruleExprNot
		{
			$current.merge(this_ExprNot_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		(
			{
				newCompositeNode(grammarAccess.getExprOrAccess().getLCParserRuleCall_1_0());
			}
			this_LC_1=ruleLC
			{
				$current.merge(this_LC_1);
			}
			{
				afterParserOrEnumRuleCall();
			}
			kw='or'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getExprOrAccess().getOrKeyword_1_1());
			}
			{
				newCompositeNode(grammarAccess.getExprOrAccess().getLCParserRuleCall_1_2());
			}
			this_LC_3=ruleLC
			{
				$current.merge(this_LC_3);
			}
			{
				afterParserOrEnumRuleCall();
			}
			{
				newCompositeNode(grammarAccess.getExprOrAccess().getExprNotParserRuleCall_1_3());
			}
			this_ExprNot_4=ruleExprNot
			{
				$current.merge(this_ExprNot_4);
			}
			{
				afterParserOrEnumRuleCall();
			}
		)*
	)
;

// Entry rule entryRuleExprNot
entryRuleExprNot returns [String current=null]:
	{ newCompositeNode(grammarAccess.getExprNotRule()); }
	iv_ruleExprNot=ruleExprNot
	{ $current=$iv_ruleExprNot.current.getText(); }
	EOF;

// Rule ExprNot
ruleExprNot returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='not'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getExprNotAccess().getNotKeyword_0_0());
			}
			{
				newCompositeNode(grammarAccess.getExprNotAccess().getLCParserRuleCall_0_1());
			}
			this_LC_1=ruleLC
			{
				$current.merge(this_LC_1);
			}
			{
				afterParserOrEnumRuleCall();
			}
			{
				newCompositeNode(grammarAccess.getExprNotAccess().getExprEqParserRuleCall_0_2());
			}
			this_ExprEq_2=ruleExprEq
			{
				$current.merge(this_ExprEq_2);
			}
			{
				afterParserOrEnumRuleCall();
			}
		)
		    |
		{
			newCompositeNode(grammarAccess.getExprNotAccess().getExprEqParserRuleCall_1());
		}
		this_ExprEq_3=ruleExprEq
		{
			$current.merge(this_ExprEq_3);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleExprEq
entryRuleExprEq returns [String current=null]:
	{ newCompositeNode(grammarAccess.getExprEqRule()); }
	iv_ruleExprEq=ruleExprEq
	{ $current=$iv_ruleExprEq.current.getText(); }
	EOF;

// Rule ExprEq
ruleExprEq returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getExprEqAccess().getExprSimpleParserRuleCall_0_0());
			}
			this_ExprSimple_0=ruleExprSimple
			{
				$current.merge(this_ExprSimple_0);
			}
			{
				afterParserOrEnumRuleCall();
			}
			kw='=?'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getExprEqAccess().getEqualsSignQuestionMarkKeyword_0_1());
			}
			{
				newCompositeNode(grammarAccess.getExprEqAccess().getExprSimpleParserRuleCall_0_2());
			}
			this_ExprSimple_2=ruleExprSimple
			{
				$current.merge(this_ExprSimple_2);
			}
			{
				afterParserOrEnumRuleCall();
			}
		)
		    |
		(
			kw='('
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getExprEqAccess().getLeftParenthesisKeyword_1_0());
			}
			{
				newCompositeNode(grammarAccess.getExprEqAccess().getExprParserRuleCall_1_1());
			}
			this_Expr_4=ruleExpr
			{
				$current.merge(this_Expr_4);
			}
			{
				afterParserOrEnumRuleCall();
			}
			kw=')'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getExprEqAccess().getRightParenthesisKeyword_1_2());
			}
		)
	)
;

// Entry rule entryRuleLC
entryRuleLC returns [String current=null]:
	{ newCompositeNode(grammarAccess.getLCRule()); }
	iv_ruleLC=ruleLC
	{ $current=$iv_ruleLC.current.getText(); }
	EOF;

// Rule LC
ruleLC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_SP_0=RULE_SP
		{
			$current.merge(this_SP_0);
		}
		{
			newLeafNode(this_SP_0, grammarAccess.getLCAccess().getSPTerminalRuleCall_0());
		}
		    |
		this_CR_1=RULE_CR
		{
			$current.merge(this_CR_1);
		}
		{
			newLeafNode(this_CR_1, grammarAccess.getLCAccess().getCRTerminalRuleCall_1());
		}
		    |
		this_TAB_2=RULE_TAB
		{
			$current.merge(this_TAB_2);
		}
		{
			newLeafNode(this_TAB_2, grammarAccess.getLCAccess().getTABTerminalRuleCall_2());
		}
		    |
		this_LF_3=RULE_LF
		{
			$current.merge(this_LF_3);
		}
		{
			newLeafNode(this_LF_3, grammarAccess.getLCAccess().getLFTerminalRuleCall_3());
		}
	)*
;

RULE_VARIABLE : 'A'..'Z' ('0'..'9'|'a'..'z'|'A'..'Z')* ('?'|'!')?;

RULE_SYMBOL : 'a'..'z' ('0'..'9'|'a'..'z'|'A'..'Z')* ('?'|'!')?;

RULE_SP : ' ';

RULE_CR : '\n';

RULE_TAB : '\t';

RULE_LF : '\r';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
