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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalWhileDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SYMBOL", "RULE_VARIABLE", "RULE_SP", "RULE_CR", "RULE_TAB", "RULE_LF", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'while'", "'do'", "'od'", "'for'", "'if'", "'then'", "'else'", "'fi'", "'foreach'", "'in'", "':='", "'nop'", "'nil'", "'('", "'cons'", "'list'", "')'", "'hd'", "'tl'", "'and'", "'or'", "'not'", "'=?'"
    };
    public static final int RULE_LF=9;
    public static final int RULE_CR=7;
    public static final int RULE_TAB=8;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_SP=6;
    public static final int RULE_ID=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=12;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=15;
    public static final int RULE_VARIABLE=5;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SYMBOL=4;
    public static final int T__46=46;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalWhileDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWhileDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWhileDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalWhileDsl.g"; }



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




    // $ANTLR start "entryRuleModel"
    // InternalWhileDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalWhileDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalWhileDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalWhileDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_program_0_0= ruleFunction ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_program_0_0 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:77:2: ( ( (lv_program_0_0= ruleFunction ) )* )
            // InternalWhileDsl.g:78:2: ( (lv_program_0_0= ruleFunction ) )*
            {
            // InternalWhileDsl.g:78:2: ( (lv_program_0_0= ruleFunction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWhileDsl.g:79:3: (lv_program_0_0= ruleFunction )
            	    {
            	    // InternalWhileDsl.g:79:3: (lv_program_0_0= ruleFunction )
            	    // InternalWhileDsl.g:80:4: lv_program_0_0= ruleFunction
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getModelAccess().getProgramFunctionParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_program_0_0=ruleFunction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getModelRule());
            	      				}
            	      				add(
            	      					current,
            	      					"program",
            	      					lv_program_0_0,
            	      					"esir.comp.cpp.WhileDsl.Function");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFunction"
    // InternalWhileDsl.g:100:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalWhileDsl.g:100:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalWhileDsl.g:101:2: iv_ruleFunction= ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalWhileDsl.g:107:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ruleLC ( (lv_functionName_2_0= RULE_SYMBOL ) ) ruleLC otherlv_4= ':' ruleLC ( (lv_functionDefinition_6_0= ruleDefinition ) ) ruleLC ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_functionName_2_0=null;
        Token otherlv_4=null;
        EObject lv_functionDefinition_6_0 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:113:2: ( (otherlv_0= 'function' ruleLC ( (lv_functionName_2_0= RULE_SYMBOL ) ) ruleLC otherlv_4= ':' ruleLC ( (lv_functionDefinition_6_0= ruleDefinition ) ) ruleLC ) )
            // InternalWhileDsl.g:114:2: (otherlv_0= 'function' ruleLC ( (lv_functionName_2_0= RULE_SYMBOL ) ) ruleLC otherlv_4= ':' ruleLC ( (lv_functionDefinition_6_0= ruleDefinition ) ) ruleLC )
            {
            // InternalWhileDsl.g:114:2: (otherlv_0= 'function' ruleLC ( (lv_functionName_2_0= RULE_SYMBOL ) ) ruleLC otherlv_4= ':' ruleLC ( (lv_functionDefinition_6_0= ruleDefinition ) ) ruleLC )
            // InternalWhileDsl.g:115:3: otherlv_0= 'function' ruleLC ( (lv_functionName_2_0= RULE_SYMBOL ) ) ruleLC otherlv_4= ':' ruleLC ( (lv_functionDefinition_6_0= ruleDefinition ) ) ruleLC
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFunctionAccess().getLCParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_5);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:126:3: ( (lv_functionName_2_0= RULE_SYMBOL ) )
            // InternalWhileDsl.g:127:4: (lv_functionName_2_0= RULE_SYMBOL )
            {
            // InternalWhileDsl.g:127:4: (lv_functionName_2_0= RULE_SYMBOL )
            // InternalWhileDsl.g:128:5: lv_functionName_2_0= RULE_SYMBOL
            {
            lv_functionName_2_0=(Token)match(input,RULE_SYMBOL,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_functionName_2_0, grammarAccess.getFunctionAccess().getFunctionNameSYMBOLTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"functionName",
              						lv_functionName_2_0,
              						"esir.comp.cpp.WhileDsl.SYMBOL");
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFunctionAccess().getLCParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_7);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,18,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getColonKeyword_4());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFunctionAccess().getLCParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_8);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:162:3: ( (lv_functionDefinition_6_0= ruleDefinition ) )
            // InternalWhileDsl.g:163:4: (lv_functionDefinition_6_0= ruleDefinition )
            {
            // InternalWhileDsl.g:163:4: (lv_functionDefinition_6_0= ruleDefinition )
            // InternalWhileDsl.g:164:5: lv_functionDefinition_6_0= ruleDefinition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionAccess().getFunctionDefinitionDefinitionParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_functionDefinition_6_0=ruleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionRule());
              					}
              					set(
              						current,
              						"functionDefinition",
              						lv_functionDefinition_6_0,
              						"esir.comp.cpp.WhileDsl.Definition");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFunctionAccess().getLCParserRuleCall_7());
              		
            }
            pushFollow(FOLLOW_2);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleDefinition"
    // InternalWhileDsl.g:192:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalWhileDsl.g:192:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalWhileDsl.g:193:2: iv_ruleDefinition= ruleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalWhileDsl.g:199:1: ruleDefinition returns [EObject current=null] : (otherlv_0= 'read' ruleLC ( (lv_intput_2_0= ruleInput ) ) ruleLC otherlv_4= '%' ruleLC ( (lv_body_6_0= ruleCommands ) ) ruleLC otherlv_8= '%' ruleLC otherlv_10= 'write' ruleLC ( (lv_output_12_0= ruleOutput ) ) ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_intput_2_0 = null;

        EObject lv_body_6_0 = null;

        EObject lv_output_12_0 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:205:2: ( (otherlv_0= 'read' ruleLC ( (lv_intput_2_0= ruleInput ) ) ruleLC otherlv_4= '%' ruleLC ( (lv_body_6_0= ruleCommands ) ) ruleLC otherlv_8= '%' ruleLC otherlv_10= 'write' ruleLC ( (lv_output_12_0= ruleOutput ) ) ) )
            // InternalWhileDsl.g:206:2: (otherlv_0= 'read' ruleLC ( (lv_intput_2_0= ruleInput ) ) ruleLC otherlv_4= '%' ruleLC ( (lv_body_6_0= ruleCommands ) ) ruleLC otherlv_8= '%' ruleLC otherlv_10= 'write' ruleLC ( (lv_output_12_0= ruleOutput ) ) )
            {
            // InternalWhileDsl.g:206:2: (otherlv_0= 'read' ruleLC ( (lv_intput_2_0= ruleInput ) ) ruleLC otherlv_4= '%' ruleLC ( (lv_body_6_0= ruleCommands ) ) ruleLC otherlv_8= '%' ruleLC otherlv_10= 'write' ruleLC ( (lv_output_12_0= ruleOutput ) ) )
            // InternalWhileDsl.g:207:3: otherlv_0= 'read' ruleLC ( (lv_intput_2_0= ruleInput ) ) ruleLC otherlv_4= '%' ruleLC ( (lv_body_6_0= ruleCommands ) ) ruleLC otherlv_8= '%' ruleLC otherlv_10= 'write' ruleLC ( (lv_output_12_0= ruleOutput ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getReadKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDefinitionAccess().getLCParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_10);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:218:3: ( (lv_intput_2_0= ruleInput ) )
            // InternalWhileDsl.g:219:4: (lv_intput_2_0= ruleInput )
            {
            // InternalWhileDsl.g:219:4: (lv_intput_2_0= ruleInput )
            // InternalWhileDsl.g:220:5: lv_intput_2_0= ruleInput
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionAccess().getIntputInputParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_intput_2_0=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefinitionRule());
              					}
              					set(
              						current,
              						"intput",
              						lv_intput_2_0,
              						"esir.comp.cpp.WhileDsl.Input");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDefinitionAccess().getLCParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_12);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,20,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDefinitionAccess().getPercentSignKeyword_4());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDefinitionAccess().getLCParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_13);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:255:3: ( (lv_body_6_0= ruleCommands ) )
            // InternalWhileDsl.g:256:4: (lv_body_6_0= ruleCommands )
            {
            // InternalWhileDsl.g:256:4: (lv_body_6_0= ruleCommands )
            // InternalWhileDsl.g:257:5: lv_body_6_0= ruleCommands
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionAccess().getBodyCommandsParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_body_6_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefinitionRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_6_0,
              						"esir.comp.cpp.WhileDsl.Commands");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDefinitionAccess().getLCParserRuleCall_7());
              		
            }
            pushFollow(FOLLOW_12);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_8=(Token)match(input,20,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getDefinitionAccess().getPercentSignKeyword_8());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDefinitionAccess().getLCParserRuleCall_9());
              		
            }
            pushFollow(FOLLOW_15);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_10=(Token)match(input,21,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getDefinitionAccess().getWriteKeyword_10());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDefinitionAccess().getLCParserRuleCall_11());
              		
            }
            pushFollow(FOLLOW_10);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:303:3: ( (lv_output_12_0= ruleOutput ) )
            // InternalWhileDsl.g:304:4: (lv_output_12_0= ruleOutput )
            {
            // InternalWhileDsl.g:304:4: (lv_output_12_0= ruleOutput )
            // InternalWhileDsl.g:305:5: lv_output_12_0= ruleOutput
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionAccess().getOutputOutputParserRuleCall_12_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_output_12_0=ruleOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefinitionRule());
              					}
              					set(
              						current,
              						"output",
              						lv_output_12_0,
              						"esir.comp.cpp.WhileDsl.Output");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleInput"
    // InternalWhileDsl.g:326:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalWhileDsl.g:326:46: (iv_ruleInput= ruleInput EOF )
            // InternalWhileDsl.g:327:2: iv_ruleInput= ruleInput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInput; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalWhileDsl.g:333:1: ruleInput returns [EObject current=null] : ( ( (lv_variables_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_variables_2_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token lv_variables_0_0=null;
        Token otherlv_1=null;
        Token lv_variables_2_0=null;


        	enterRule();

        try {
            // InternalWhileDsl.g:339:2: ( ( ( (lv_variables_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_variables_2_0= RULE_VARIABLE ) ) )* ) )
            // InternalWhileDsl.g:340:2: ( ( (lv_variables_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_variables_2_0= RULE_VARIABLE ) ) )* )
            {
            // InternalWhileDsl.g:340:2: ( ( (lv_variables_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_variables_2_0= RULE_VARIABLE ) ) )* )
            // InternalWhileDsl.g:341:3: ( (lv_variables_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_variables_2_0= RULE_VARIABLE ) ) )*
            {
            // InternalWhileDsl.g:341:3: ( (lv_variables_0_0= RULE_VARIABLE ) )
            // InternalWhileDsl.g:342:4: (lv_variables_0_0= RULE_VARIABLE )
            {
            // InternalWhileDsl.g:342:4: (lv_variables_0_0= RULE_VARIABLE )
            // InternalWhileDsl.g:343:5: lv_variables_0_0= RULE_VARIABLE
            {
            lv_variables_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_variables_0_0, grammarAccess.getInputAccess().getVariablesVARIABLETerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInputRule());
              					}
              					addWithLastConsumed(
              						current,
              						"variables",
              						lv_variables_0_0,
              						"esir.comp.cpp.WhileDsl.VARIABLE");
              				
            }

            }


            }

            // InternalWhileDsl.g:359:3: (otherlv_1= ',' ( (lv_variables_2_0= RULE_VARIABLE ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalWhileDsl.g:360:4: otherlv_1= ',' ( (lv_variables_2_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getInputAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalWhileDsl.g:364:4: ( (lv_variables_2_0= RULE_VARIABLE ) )
            	    // InternalWhileDsl.g:365:5: (lv_variables_2_0= RULE_VARIABLE )
            	    {
            	    // InternalWhileDsl.g:365:5: (lv_variables_2_0= RULE_VARIABLE )
            	    // InternalWhileDsl.g:366:6: lv_variables_2_0= RULE_VARIABLE
            	    {
            	    lv_variables_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_variables_2_0, grammarAccess.getInputAccess().getVariablesVARIABLETerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getInputRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"variables",
            	      							lv_variables_2_0,
            	      							"esir.comp.cpp.WhileDsl.VARIABLE");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // InternalWhileDsl.g:387:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalWhileDsl.g:387:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalWhileDsl.g:388:2: iv_ruleOutput= ruleOutput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutput; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalWhileDsl.g:394:1: ruleOutput returns [EObject current=null] : ( ( (lv_variables_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_variables_2_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token lv_variables_0_0=null;
        Token otherlv_1=null;
        Token lv_variables_2_0=null;


        	enterRule();

        try {
            // InternalWhileDsl.g:400:2: ( ( ( (lv_variables_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_variables_2_0= RULE_VARIABLE ) ) )* ) )
            // InternalWhileDsl.g:401:2: ( ( (lv_variables_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_variables_2_0= RULE_VARIABLE ) ) )* )
            {
            // InternalWhileDsl.g:401:2: ( ( (lv_variables_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_variables_2_0= RULE_VARIABLE ) ) )* )
            // InternalWhileDsl.g:402:3: ( (lv_variables_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_variables_2_0= RULE_VARIABLE ) ) )*
            {
            // InternalWhileDsl.g:402:3: ( (lv_variables_0_0= RULE_VARIABLE ) )
            // InternalWhileDsl.g:403:4: (lv_variables_0_0= RULE_VARIABLE )
            {
            // InternalWhileDsl.g:403:4: (lv_variables_0_0= RULE_VARIABLE )
            // InternalWhileDsl.g:404:5: lv_variables_0_0= RULE_VARIABLE
            {
            lv_variables_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_variables_0_0, grammarAccess.getOutputAccess().getVariablesVARIABLETerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getOutputRule());
              					}
              					addWithLastConsumed(
              						current,
              						"variables",
              						lv_variables_0_0,
              						"esir.comp.cpp.WhileDsl.VARIABLE");
              				
            }

            }


            }

            // InternalWhileDsl.g:420:3: (otherlv_1= ',' ( (lv_variables_2_0= RULE_VARIABLE ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalWhileDsl.g:421:4: otherlv_1= ',' ( (lv_variables_2_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalWhileDsl.g:425:4: ( (lv_variables_2_0= RULE_VARIABLE ) )
            	    // InternalWhileDsl.g:426:5: (lv_variables_2_0= RULE_VARIABLE )
            	    {
            	    // InternalWhileDsl.g:426:5: (lv_variables_2_0= RULE_VARIABLE )
            	    // InternalWhileDsl.g:427:6: lv_variables_2_0= RULE_VARIABLE
            	    {
            	    lv_variables_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_variables_2_0, grammarAccess.getOutputAccess().getVariablesVARIABLETerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getOutputRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"variables",
            	      							lv_variables_2_0,
            	      							"esir.comp.cpp.WhileDsl.VARIABLE");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleCommands"
    // InternalWhileDsl.g:448:1: entryRuleCommands returns [EObject current=null] : iv_ruleCommands= ruleCommands EOF ;
    public final EObject entryRuleCommands() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommands = null;


        try {
            // InternalWhileDsl.g:448:49: (iv_ruleCommands= ruleCommands EOF )
            // InternalWhileDsl.g:449:2: iv_ruleCommands= ruleCommands EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommands=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommands; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommands"


    // $ANTLR start "ruleCommands"
    // InternalWhileDsl.g:455:1: ruleCommands returns [EObject current=null] : ( ( (lv_commands_0_0= ruleCommand ) ) ( ruleLC otherlv_2= ';' ruleLC ( (lv_commands_4_0= ruleCommand ) ) )* ) ;
    public final EObject ruleCommands() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_commands_0_0 = null;

        EObject lv_commands_4_0 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:461:2: ( ( ( (lv_commands_0_0= ruleCommand ) ) ( ruleLC otherlv_2= ';' ruleLC ( (lv_commands_4_0= ruleCommand ) ) )* ) )
            // InternalWhileDsl.g:462:2: ( ( (lv_commands_0_0= ruleCommand ) ) ( ruleLC otherlv_2= ';' ruleLC ( (lv_commands_4_0= ruleCommand ) ) )* )
            {
            // InternalWhileDsl.g:462:2: ( ( (lv_commands_0_0= ruleCommand ) ) ( ruleLC otherlv_2= ';' ruleLC ( (lv_commands_4_0= ruleCommand ) ) )* )
            // InternalWhileDsl.g:463:3: ( (lv_commands_0_0= ruleCommand ) ) ( ruleLC otherlv_2= ';' ruleLC ( (lv_commands_4_0= ruleCommand ) ) )*
            {
            // InternalWhileDsl.g:463:3: ( (lv_commands_0_0= ruleCommand ) )
            // InternalWhileDsl.g:464:4: (lv_commands_0_0= ruleCommand )
            {
            // InternalWhileDsl.g:464:4: (lv_commands_0_0= ruleCommand )
            // InternalWhileDsl.g:465:5: lv_commands_0_0= ruleCommand
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCommandsAccess().getCommandsCommandParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_commands_0_0=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCommandsRule());
              					}
              					add(
              						current,
              						"commands",
              						lv_commands_0_0,
              						"esir.comp.cpp.WhileDsl.Command");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalWhileDsl.g:482:3: ( ruleLC otherlv_2= ';' ruleLC ( (lv_commands_4_0= ruleCommand ) ) )*
            loop4:
            do {
                int alt4=2;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // InternalWhileDsl.g:483:4: ruleLC otherlv_2= ';' ruleLC ( (lv_commands_4_0= ruleCommand ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getCommandsAccess().getLCParserRuleCall_1_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_19);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    otherlv_2=(Token)match(input,23,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getCommandsAccess().getSemicolonKeyword_1_1());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getCommandsAccess().getLCParserRuleCall_1_2());
            	      			
            	    }
            	    pushFollow(FOLLOW_13);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalWhileDsl.g:501:4: ( (lv_commands_4_0= ruleCommand ) )
            	    // InternalWhileDsl.g:502:5: (lv_commands_4_0= ruleCommand )
            	    {
            	    // InternalWhileDsl.g:502:5: (lv_commands_4_0= ruleCommand )
            	    // InternalWhileDsl.g:503:6: lv_commands_4_0= ruleCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getCommandsAccess().getCommandsCommandParserRuleCall_1_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_commands_4_0=ruleCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getCommandsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"commands",
            	      							lv_commands_4_0,
            	      							"esir.comp.cpp.WhileDsl.Command");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommands"


    // $ANTLR start "entryRuleCommand"
    // InternalWhileDsl.g:525:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalWhileDsl.g:525:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalWhileDsl.g:526:2: iv_ruleCommand= ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalWhileDsl.g:532:1: ruleCommand returns [EObject current=null] : ( ( () ruleNopCommand ) | this_WhileCommand_2= ruleWhileCommand | this_ForCommand_3= ruleForCommand | this_IfCommand_4= ruleIfCommand | this_ForeachCommand_5= ruleForeachCommand | this_VarsCommand_6= ruleVarsCommand ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_WhileCommand_2 = null;

        EObject this_ForCommand_3 = null;

        EObject this_IfCommand_4 = null;

        EObject this_ForeachCommand_5 = null;

        EObject this_VarsCommand_6 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:538:2: ( ( ( () ruleNopCommand ) | this_WhileCommand_2= ruleWhileCommand | this_ForCommand_3= ruleForCommand | this_IfCommand_4= ruleIfCommand | this_ForeachCommand_5= ruleForeachCommand | this_VarsCommand_6= ruleVarsCommand ) )
            // InternalWhileDsl.g:539:2: ( ( () ruleNopCommand ) | this_WhileCommand_2= ruleWhileCommand | this_ForCommand_3= ruleForCommand | this_IfCommand_4= ruleIfCommand | this_ForeachCommand_5= ruleForeachCommand | this_VarsCommand_6= ruleVarsCommand )
            {
            // InternalWhileDsl.g:539:2: ( ( () ruleNopCommand ) | this_WhileCommand_2= ruleWhileCommand | this_ForCommand_3= ruleForCommand | this_IfCommand_4= ruleIfCommand | this_ForeachCommand_5= ruleForeachCommand | this_VarsCommand_6= ruleVarsCommand )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt5=1;
                }
                break;
            case 24:
                {
                alt5=2;
                }
                break;
            case 27:
                {
                alt5=3;
                }
                break;
            case 28:
                {
                alt5=4;
                }
                break;
            case 32:
                {
                alt5=5;
                }
                break;
            case RULE_VARIABLE:
                {
                alt5=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalWhileDsl.g:540:3: ( () ruleNopCommand )
                    {
                    // InternalWhileDsl.g:540:3: ( () ruleNopCommand )
                    // InternalWhileDsl.g:541:4: () ruleNopCommand
                    {
                    // InternalWhileDsl.g:541:4: ()
                    // InternalWhileDsl.g:542:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getCommandAccess().getNopCommandAction_0_0(),
                      						current);
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCommandAccess().getNopCommandParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    ruleNopCommand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalWhileDsl.g:557:3: this_WhileCommand_2= ruleWhileCommand
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCommandAccess().getWhileCommandParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_WhileCommand_2=ruleWhileCommand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_WhileCommand_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalWhileDsl.g:566:3: this_ForCommand_3= ruleForCommand
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCommandAccess().getForCommandParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ForCommand_3=ruleForCommand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ForCommand_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalWhileDsl.g:575:3: this_IfCommand_4= ruleIfCommand
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCommandAccess().getIfCommandParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IfCommand_4=ruleIfCommand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfCommand_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalWhileDsl.g:584:3: this_ForeachCommand_5= ruleForeachCommand
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCommandAccess().getForeachCommandParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ForeachCommand_5=ruleForeachCommand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ForeachCommand_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalWhileDsl.g:593:3: this_VarsCommand_6= ruleVarsCommand
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCommandAccess().getVarsCommandParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VarsCommand_6=ruleVarsCommand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VarsCommand_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleWhileCommand"
    // InternalWhileDsl.g:605:1: entryRuleWhileCommand returns [EObject current=null] : iv_ruleWhileCommand= ruleWhileCommand EOF ;
    public final EObject entryRuleWhileCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileCommand = null;


        try {
            // InternalWhileDsl.g:605:53: (iv_ruleWhileCommand= ruleWhileCommand EOF )
            // InternalWhileDsl.g:606:2: iv_ruleWhileCommand= ruleWhileCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhileCommand=ruleWhileCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhileCommand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhileCommand"


    // $ANTLR start "ruleWhileCommand"
    // InternalWhileDsl.g:612:1: ruleWhileCommand returns [EObject current=null] : (otherlv_0= 'while' ruleLC ( (lv_cond_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_body_6_0= ruleCommands ) ) ruleLC otherlv_8= 'od' ) ;
    public final EObject ruleWhileCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_cond_2_0 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:618:2: ( (otherlv_0= 'while' ruleLC ( (lv_cond_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_body_6_0= ruleCommands ) ) ruleLC otherlv_8= 'od' ) )
            // InternalWhileDsl.g:619:2: (otherlv_0= 'while' ruleLC ( (lv_cond_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_body_6_0= ruleCommands ) ) ruleLC otherlv_8= 'od' )
            {
            // InternalWhileDsl.g:619:2: (otherlv_0= 'while' ruleLC ( (lv_cond_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_body_6_0= ruleCommands ) ) ruleLC otherlv_8= 'od' )
            // InternalWhileDsl.g:620:3: otherlv_0= 'while' ruleLC ( (lv_cond_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_body_6_0= ruleCommands ) ) ruleLC otherlv_8= 'od'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileCommandAccess().getWhileKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getWhileCommandAccess().getLCParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_20);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:631:3: ( (lv_cond_2_0= ruleExpr ) )
            // InternalWhileDsl.g:632:4: (lv_cond_2_0= ruleExpr )
            {
            // InternalWhileDsl.g:632:4: (lv_cond_2_0= ruleExpr )
            // InternalWhileDsl.g:633:5: lv_cond_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileCommandAccess().getCondExprParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_cond_2_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileCommandRule());
              					}
              					set(
              						current,
              						"cond",
              						lv_cond_2_0,
              						"esir.comp.cpp.WhileDsl.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getWhileCommandAccess().getLCParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_22);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,25,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWhileCommandAccess().getDoKeyword_4());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getWhileCommandAccess().getLCParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_13);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:668:3: ( (lv_body_6_0= ruleCommands ) )
            // InternalWhileDsl.g:669:4: (lv_body_6_0= ruleCommands )
            {
            // InternalWhileDsl.g:669:4: (lv_body_6_0= ruleCommands )
            // InternalWhileDsl.g:670:5: lv_body_6_0= ruleCommands
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileCommandAccess().getBodyCommandsParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_23);
            lv_body_6_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileCommandRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_6_0,
              						"esir.comp.cpp.WhileDsl.Commands");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getWhileCommandAccess().getLCParserRuleCall_7());
              		
            }
            pushFollow(FOLLOW_24);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_8=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getWhileCommandAccess().getOdKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhileCommand"


    // $ANTLR start "entryRuleForCommand"
    // InternalWhileDsl.g:702:1: entryRuleForCommand returns [EObject current=null] : iv_ruleForCommand= ruleForCommand EOF ;
    public final EObject entryRuleForCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForCommand = null;


        try {
            // InternalWhileDsl.g:702:51: (iv_ruleForCommand= ruleForCommand EOF )
            // InternalWhileDsl.g:703:2: iv_ruleForCommand= ruleForCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForCommand=ruleForCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForCommand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForCommand"


    // $ANTLR start "ruleForCommand"
    // InternalWhileDsl.g:709:1: ruleForCommand returns [EObject current=null] : (otherlv_0= 'for' ruleLC ( (lv_cond_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_body_6_0= ruleCommands ) ) ruleLC otherlv_8= 'od' ) ;
    public final EObject ruleForCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_cond_2_0 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:715:2: ( (otherlv_0= 'for' ruleLC ( (lv_cond_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_body_6_0= ruleCommands ) ) ruleLC otherlv_8= 'od' ) )
            // InternalWhileDsl.g:716:2: (otherlv_0= 'for' ruleLC ( (lv_cond_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_body_6_0= ruleCommands ) ) ruleLC otherlv_8= 'od' )
            {
            // InternalWhileDsl.g:716:2: (otherlv_0= 'for' ruleLC ( (lv_cond_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_body_6_0= ruleCommands ) ) ruleLC otherlv_8= 'od' )
            // InternalWhileDsl.g:717:3: otherlv_0= 'for' ruleLC ( (lv_cond_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_body_6_0= ruleCommands ) ) ruleLC otherlv_8= 'od'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForCommandAccess().getForKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getForCommandAccess().getLCParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_20);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:728:3: ( (lv_cond_2_0= ruleExpr ) )
            // InternalWhileDsl.g:729:4: (lv_cond_2_0= ruleExpr )
            {
            // InternalWhileDsl.g:729:4: (lv_cond_2_0= ruleExpr )
            // InternalWhileDsl.g:730:5: lv_cond_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForCommandAccess().getCondExprParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_cond_2_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForCommandRule());
              					}
              					set(
              						current,
              						"cond",
              						lv_cond_2_0,
              						"esir.comp.cpp.WhileDsl.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getForCommandAccess().getLCParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_22);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,25,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForCommandAccess().getDoKeyword_4());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getForCommandAccess().getLCParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_13);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:765:3: ( (lv_body_6_0= ruleCommands ) )
            // InternalWhileDsl.g:766:4: (lv_body_6_0= ruleCommands )
            {
            // InternalWhileDsl.g:766:4: (lv_body_6_0= ruleCommands )
            // InternalWhileDsl.g:767:5: lv_body_6_0= ruleCommands
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForCommandAccess().getBodyCommandsParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_23);
            lv_body_6_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForCommandRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_6_0,
              						"esir.comp.cpp.WhileDsl.Commands");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getForCommandAccess().getLCParserRuleCall_7());
              		
            }
            pushFollow(FOLLOW_24);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_8=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getForCommandAccess().getOdKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForCommand"


    // $ANTLR start "entryRuleIfCommand"
    // InternalWhileDsl.g:799:1: entryRuleIfCommand returns [EObject current=null] : iv_ruleIfCommand= ruleIfCommand EOF ;
    public final EObject entryRuleIfCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfCommand = null;


        try {
            // InternalWhileDsl.g:799:50: (iv_ruleIfCommand= ruleIfCommand EOF )
            // InternalWhileDsl.g:800:2: iv_ruleIfCommand= ruleIfCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfCommand=ruleIfCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfCommand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfCommand"


    // $ANTLR start "ruleIfCommand"
    // InternalWhileDsl.g:806:1: ruleIfCommand returns [EObject current=null] : (otherlv_0= 'if' ruleLC ( (lv_cond_2_0= ruleExpr ) ) ruleLC otherlv_4= 'then' ruleLC ( (lv_thenBody_6_0= ruleCommands ) ) ruleLC (otherlv_8= 'else' ruleLC ( (lv_elseBody_10_0= ruleCommands ) ) ruleLC )? otherlv_12= 'fi' ) ;
    public final EObject ruleIfCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        Token otherlv_12=null;
        EObject lv_cond_2_0 = null;

        EObject lv_thenBody_6_0 = null;

        EObject lv_elseBody_10_0 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:812:2: ( (otherlv_0= 'if' ruleLC ( (lv_cond_2_0= ruleExpr ) ) ruleLC otherlv_4= 'then' ruleLC ( (lv_thenBody_6_0= ruleCommands ) ) ruleLC (otherlv_8= 'else' ruleLC ( (lv_elseBody_10_0= ruleCommands ) ) ruleLC )? otherlv_12= 'fi' ) )
            // InternalWhileDsl.g:813:2: (otherlv_0= 'if' ruleLC ( (lv_cond_2_0= ruleExpr ) ) ruleLC otherlv_4= 'then' ruleLC ( (lv_thenBody_6_0= ruleCommands ) ) ruleLC (otherlv_8= 'else' ruleLC ( (lv_elseBody_10_0= ruleCommands ) ) ruleLC )? otherlv_12= 'fi' )
            {
            // InternalWhileDsl.g:813:2: (otherlv_0= 'if' ruleLC ( (lv_cond_2_0= ruleExpr ) ) ruleLC otherlv_4= 'then' ruleLC ( (lv_thenBody_6_0= ruleCommands ) ) ruleLC (otherlv_8= 'else' ruleLC ( (lv_elseBody_10_0= ruleCommands ) ) ruleLC )? otherlv_12= 'fi' )
            // InternalWhileDsl.g:814:3: otherlv_0= 'if' ruleLC ( (lv_cond_2_0= ruleExpr ) ) ruleLC otherlv_4= 'then' ruleLC ( (lv_thenBody_6_0= ruleCommands ) ) ruleLC (otherlv_8= 'else' ruleLC ( (lv_elseBody_10_0= ruleCommands ) ) ruleLC )? otherlv_12= 'fi'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfCommandAccess().getIfKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getIfCommandAccess().getLCParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_20);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:825:3: ( (lv_cond_2_0= ruleExpr ) )
            // InternalWhileDsl.g:826:4: (lv_cond_2_0= ruleExpr )
            {
            // InternalWhileDsl.g:826:4: (lv_cond_2_0= ruleExpr )
            // InternalWhileDsl.g:827:5: lv_cond_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfCommandAccess().getCondExprParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_cond_2_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfCommandRule());
              					}
              					set(
              						current,
              						"cond",
              						lv_cond_2_0,
              						"esir.comp.cpp.WhileDsl.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getIfCommandAccess().getLCParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_26);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,29,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getIfCommandAccess().getThenKeyword_4());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getIfCommandAccess().getLCParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_13);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:862:3: ( (lv_thenBody_6_0= ruleCommands ) )
            // InternalWhileDsl.g:863:4: (lv_thenBody_6_0= ruleCommands )
            {
            // InternalWhileDsl.g:863:4: (lv_thenBody_6_0= ruleCommands )
            // InternalWhileDsl.g:864:5: lv_thenBody_6_0= ruleCommands
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfCommandAccess().getThenBodyCommandsParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_27);
            lv_thenBody_6_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfCommandRule());
              					}
              					set(
              						current,
              						"thenBody",
              						lv_thenBody_6_0,
              						"esir.comp.cpp.WhileDsl.Commands");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getIfCommandAccess().getLCParserRuleCall_7());
              		
            }
            pushFollow(FOLLOW_28);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:888:3: (otherlv_8= 'else' ruleLC ( (lv_elseBody_10_0= ruleCommands ) ) ruleLC )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalWhileDsl.g:889:4: otherlv_8= 'else' ruleLC ( (lv_elseBody_10_0= ruleCommands ) ) ruleLC
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getIfCommandAccess().getElseKeyword_8_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getIfCommandAccess().getLCParserRuleCall_8_1());
                      			
                    }
                    pushFollow(FOLLOW_13);
                    ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalWhileDsl.g:900:4: ( (lv_elseBody_10_0= ruleCommands ) )
                    // InternalWhileDsl.g:901:5: (lv_elseBody_10_0= ruleCommands )
                    {
                    // InternalWhileDsl.g:901:5: (lv_elseBody_10_0= ruleCommands )
                    // InternalWhileDsl.g:902:6: lv_elseBody_10_0= ruleCommands
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfCommandAccess().getElseBodyCommandsParserRuleCall_8_2_0());
                      					
                    }
                    pushFollow(FOLLOW_29);
                    lv_elseBody_10_0=ruleCommands();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfCommandRule());
                      						}
                      						set(
                      							current,
                      							"elseBody",
                      							lv_elseBody_10_0,
                      							"esir.comp.cpp.WhileDsl.Commands");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getIfCommandAccess().getLCParserRuleCall_8_3());
                      			
                    }
                    pushFollow(FOLLOW_30);
                    ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_12=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getIfCommandAccess().getFiKeyword_9());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfCommand"


    // $ANTLR start "entryRuleForeachCommand"
    // InternalWhileDsl.g:935:1: entryRuleForeachCommand returns [EObject current=null] : iv_ruleForeachCommand= ruleForeachCommand EOF ;
    public final EObject entryRuleForeachCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeachCommand = null;


        try {
            // InternalWhileDsl.g:935:55: (iv_ruleForeachCommand= ruleForeachCommand EOF )
            // InternalWhileDsl.g:936:2: iv_ruleForeachCommand= ruleForeachCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForeachCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForeachCommand=ruleForeachCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForeachCommand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForeachCommand"


    // $ANTLR start "ruleForeachCommand"
    // InternalWhileDsl.g:942:1: ruleForeachCommand returns [EObject current=null] : (otherlv_0= 'foreach' ruleLC ( (lv_expElement_2_0= ruleExpr ) ) ruleLC otherlv_4= 'in' ruleLC ( (lv_expList_6_0= ruleExpr ) ) ruleLC otherlv_8= 'do' ruleLC ( (lv_body_10_0= ruleCommands ) ) ruleLC otherlv_12= 'od' ) ;
    public final EObject ruleForeachCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        Token otherlv_12=null;
        EObject lv_expElement_2_0 = null;

        EObject lv_expList_6_0 = null;

        EObject lv_body_10_0 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:948:2: ( (otherlv_0= 'foreach' ruleLC ( (lv_expElement_2_0= ruleExpr ) ) ruleLC otherlv_4= 'in' ruleLC ( (lv_expList_6_0= ruleExpr ) ) ruleLC otherlv_8= 'do' ruleLC ( (lv_body_10_0= ruleCommands ) ) ruleLC otherlv_12= 'od' ) )
            // InternalWhileDsl.g:949:2: (otherlv_0= 'foreach' ruleLC ( (lv_expElement_2_0= ruleExpr ) ) ruleLC otherlv_4= 'in' ruleLC ( (lv_expList_6_0= ruleExpr ) ) ruleLC otherlv_8= 'do' ruleLC ( (lv_body_10_0= ruleCommands ) ) ruleLC otherlv_12= 'od' )
            {
            // InternalWhileDsl.g:949:2: (otherlv_0= 'foreach' ruleLC ( (lv_expElement_2_0= ruleExpr ) ) ruleLC otherlv_4= 'in' ruleLC ( (lv_expList_6_0= ruleExpr ) ) ruleLC otherlv_8= 'do' ruleLC ( (lv_body_10_0= ruleCommands ) ) ruleLC otherlv_12= 'od' )
            // InternalWhileDsl.g:950:3: otherlv_0= 'foreach' ruleLC ( (lv_expElement_2_0= ruleExpr ) ) ruleLC otherlv_4= 'in' ruleLC ( (lv_expList_6_0= ruleExpr ) ) ruleLC otherlv_8= 'do' ruleLC ( (lv_body_10_0= ruleCommands ) ) ruleLC otherlv_12= 'od'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForeachCommandAccess().getForeachKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getForeachCommandAccess().getLCParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_20);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:961:3: ( (lv_expElement_2_0= ruleExpr ) )
            // InternalWhileDsl.g:962:4: (lv_expElement_2_0= ruleExpr )
            {
            // InternalWhileDsl.g:962:4: (lv_expElement_2_0= ruleExpr )
            // InternalWhileDsl.g:963:5: lv_expElement_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForeachCommandAccess().getExpElementExprParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_expElement_2_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForeachCommandRule());
              					}
              					set(
              						current,
              						"expElement",
              						lv_expElement_2_0,
              						"esir.comp.cpp.WhileDsl.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getForeachCommandAccess().getLCParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_32);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,33,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForeachCommandAccess().getInKeyword_4());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getForeachCommandAccess().getLCParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_20);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:998:3: ( (lv_expList_6_0= ruleExpr ) )
            // InternalWhileDsl.g:999:4: (lv_expList_6_0= ruleExpr )
            {
            // InternalWhileDsl.g:999:4: (lv_expList_6_0= ruleExpr )
            // InternalWhileDsl.g:1000:5: lv_expList_6_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForeachCommandAccess().getExpListExprParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_expList_6_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForeachCommandRule());
              					}
              					set(
              						current,
              						"expList",
              						lv_expList_6_0,
              						"esir.comp.cpp.WhileDsl.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getForeachCommandAccess().getLCParserRuleCall_7());
              		
            }
            pushFollow(FOLLOW_22);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_8=(Token)match(input,25,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getForeachCommandAccess().getDoKeyword_8());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getForeachCommandAccess().getLCParserRuleCall_9());
              		
            }
            pushFollow(FOLLOW_13);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:1035:3: ( (lv_body_10_0= ruleCommands ) )
            // InternalWhileDsl.g:1036:4: (lv_body_10_0= ruleCommands )
            {
            // InternalWhileDsl.g:1036:4: (lv_body_10_0= ruleCommands )
            // InternalWhileDsl.g:1037:5: lv_body_10_0= ruleCommands
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForeachCommandAccess().getBodyCommandsParserRuleCall_10_0());
              				
            }
            pushFollow(FOLLOW_23);
            lv_body_10_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForeachCommandRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_10_0,
              						"esir.comp.cpp.WhileDsl.Commands");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getForeachCommandAccess().getLCParserRuleCall_11());
              		
            }
            pushFollow(FOLLOW_24);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_12=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getForeachCommandAccess().getOdKeyword_12());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForeachCommand"


    // $ANTLR start "entryRuleVarsCommand"
    // InternalWhileDsl.g:1069:1: entryRuleVarsCommand returns [EObject current=null] : iv_ruleVarsCommand= ruleVarsCommand EOF ;
    public final EObject entryRuleVarsCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarsCommand = null;


        try {
            // InternalWhileDsl.g:1069:52: (iv_ruleVarsCommand= ruleVarsCommand EOF )
            // InternalWhileDsl.g:1070:2: iv_ruleVarsCommand= ruleVarsCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarsCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarsCommand=ruleVarsCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarsCommand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarsCommand"


    // $ANTLR start "ruleVarsCommand"
    // InternalWhileDsl.g:1076:1: ruleVarsCommand returns [EObject current=null] : ( ( (lv_variables_0_0= ruleVars ) ) ruleLC otherlv_2= ':=' ruleLC ( (lv_values_4_0= ruleExprs ) ) ) ;
    public final EObject ruleVarsCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_variables_0_0 = null;

        EObject lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:1082:2: ( ( ( (lv_variables_0_0= ruleVars ) ) ruleLC otherlv_2= ':=' ruleLC ( (lv_values_4_0= ruleExprs ) ) ) )
            // InternalWhileDsl.g:1083:2: ( ( (lv_variables_0_0= ruleVars ) ) ruleLC otherlv_2= ':=' ruleLC ( (lv_values_4_0= ruleExprs ) ) )
            {
            // InternalWhileDsl.g:1083:2: ( ( (lv_variables_0_0= ruleVars ) ) ruleLC otherlv_2= ':=' ruleLC ( (lv_values_4_0= ruleExprs ) ) )
            // InternalWhileDsl.g:1084:3: ( (lv_variables_0_0= ruleVars ) ) ruleLC otherlv_2= ':=' ruleLC ( (lv_values_4_0= ruleExprs ) )
            {
            // InternalWhileDsl.g:1084:3: ( (lv_variables_0_0= ruleVars ) )
            // InternalWhileDsl.g:1085:4: (lv_variables_0_0= ruleVars )
            {
            // InternalWhileDsl.g:1085:4: (lv_variables_0_0= ruleVars )
            // InternalWhileDsl.g:1086:5: lv_variables_0_0= ruleVars
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarsCommandAccess().getVariablesVarsParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_33);
            lv_variables_0_0=ruleVars();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVarsCommandRule());
              					}
              					set(
              						current,
              						"variables",
              						lv_variables_0_0,
              						"esir.comp.cpp.WhileDsl.Vars");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVarsCommandAccess().getLCParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_34);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,34,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getVarsCommandAccess().getColonEqualsSignKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVarsCommandAccess().getLCParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_20);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:1121:3: ( (lv_values_4_0= ruleExprs ) )
            // InternalWhileDsl.g:1122:4: (lv_values_4_0= ruleExprs )
            {
            // InternalWhileDsl.g:1122:4: (lv_values_4_0= ruleExprs )
            // InternalWhileDsl.g:1123:5: lv_values_4_0= ruleExprs
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarsCommandAccess().getValuesExprsParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_values_4_0=ruleExprs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVarsCommandRule());
              					}
              					set(
              						current,
              						"values",
              						lv_values_4_0,
              						"esir.comp.cpp.WhileDsl.Exprs");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarsCommand"


    // $ANTLR start "entryRuleNopCommand"
    // InternalWhileDsl.g:1144:1: entryRuleNopCommand returns [String current=null] : iv_ruleNopCommand= ruleNopCommand EOF ;
    public final String entryRuleNopCommand() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNopCommand = null;


        try {
            // InternalWhileDsl.g:1144:50: (iv_ruleNopCommand= ruleNopCommand EOF )
            // InternalWhileDsl.g:1145:2: iv_ruleNopCommand= ruleNopCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNopCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNopCommand=ruleNopCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNopCommand.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNopCommand"


    // $ANTLR start "ruleNopCommand"
    // InternalWhileDsl.g:1151:1: ruleNopCommand returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'nop' ;
    public final AntlrDatatypeRuleToken ruleNopCommand() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWhileDsl.g:1157:2: (kw= 'nop' )
            // InternalWhileDsl.g:1158:2: kw= 'nop'
            {
            kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getNopCommandAccess().getNopKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNopCommand"


    // $ANTLR start "entryRuleVars"
    // InternalWhileDsl.g:1166:1: entryRuleVars returns [EObject current=null] : iv_ruleVars= ruleVars EOF ;
    public final EObject entryRuleVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVars = null;


        try {
            // InternalWhileDsl.g:1166:45: (iv_ruleVars= ruleVars EOF )
            // InternalWhileDsl.g:1167:2: iv_ruleVars= ruleVars EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVars=ruleVars();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVars; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVars"


    // $ANTLR start "ruleVars"
    // InternalWhileDsl.g:1173:1: ruleVars returns [EObject current=null] : ( ( (lv_variables_0_0= RULE_VARIABLE ) ) ( ruleLC otherlv_2= ',' ruleLC ( (lv_variables_4_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleVars() throws RecognitionException {
        EObject current = null;

        Token lv_variables_0_0=null;
        Token otherlv_2=null;
        Token lv_variables_4_0=null;


        	enterRule();

        try {
            // InternalWhileDsl.g:1179:2: ( ( ( (lv_variables_0_0= RULE_VARIABLE ) ) ( ruleLC otherlv_2= ',' ruleLC ( (lv_variables_4_0= RULE_VARIABLE ) ) )* ) )
            // InternalWhileDsl.g:1180:2: ( ( (lv_variables_0_0= RULE_VARIABLE ) ) ( ruleLC otherlv_2= ',' ruleLC ( (lv_variables_4_0= RULE_VARIABLE ) ) )* )
            {
            // InternalWhileDsl.g:1180:2: ( ( (lv_variables_0_0= RULE_VARIABLE ) ) ( ruleLC otherlv_2= ',' ruleLC ( (lv_variables_4_0= RULE_VARIABLE ) ) )* )
            // InternalWhileDsl.g:1181:3: ( (lv_variables_0_0= RULE_VARIABLE ) ) ( ruleLC otherlv_2= ',' ruleLC ( (lv_variables_4_0= RULE_VARIABLE ) ) )*
            {
            // InternalWhileDsl.g:1181:3: ( (lv_variables_0_0= RULE_VARIABLE ) )
            // InternalWhileDsl.g:1182:4: (lv_variables_0_0= RULE_VARIABLE )
            {
            // InternalWhileDsl.g:1182:4: (lv_variables_0_0= RULE_VARIABLE )
            // InternalWhileDsl.g:1183:5: lv_variables_0_0= RULE_VARIABLE
            {
            lv_variables_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_variables_0_0, grammarAccess.getVarsAccess().getVariablesVARIABLETerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVarsRule());
              					}
              					addWithLastConsumed(
              						current,
              						"variables",
              						lv_variables_0_0,
              						"esir.comp.cpp.WhileDsl.VARIABLE");
              				
            }

            }


            }

            // InternalWhileDsl.g:1199:3: ( ruleLC otherlv_2= ',' ruleLC ( (lv_variables_4_0= RULE_VARIABLE ) ) )*
            loop7:
            do {
                int alt7=2;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // InternalWhileDsl.g:1200:4: ruleLC otherlv_2= ',' ruleLC ( (lv_variables_4_0= RULE_VARIABLE ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getVarsAccess().getLCParserRuleCall_1_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_36);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    otherlv_2=(Token)match(input,22,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getVarsAccess().getCommaKeyword_1_1());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getVarsAccess().getLCParserRuleCall_1_2());
            	      			
            	    }
            	    pushFollow(FOLLOW_17);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalWhileDsl.g:1218:4: ( (lv_variables_4_0= RULE_VARIABLE ) )
            	    // InternalWhileDsl.g:1219:5: (lv_variables_4_0= RULE_VARIABLE )
            	    {
            	    // InternalWhileDsl.g:1219:5: (lv_variables_4_0= RULE_VARIABLE )
            	    // InternalWhileDsl.g:1220:6: lv_variables_4_0= RULE_VARIABLE
            	    {
            	    lv_variables_4_0=(Token)match(input,RULE_VARIABLE,FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_variables_4_0, grammarAccess.getVarsAccess().getVariablesVARIABLETerminalRuleCall_1_3_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getVarsRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"variables",
            	      							lv_variables_4_0,
            	      							"esir.comp.cpp.WhileDsl.VARIABLE");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVars"


    // $ANTLR start "entryRuleExprSimple"
    // InternalWhileDsl.g:1241:1: entryRuleExprSimple returns [EObject current=null] : iv_ruleExprSimple= ruleExprSimple EOF ;
    public final EObject entryRuleExprSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprSimple = null;


        try {
            // InternalWhileDsl.g:1241:51: (iv_ruleExprSimple= ruleExprSimple EOF )
            // InternalWhileDsl.g:1242:2: iv_ruleExprSimple= ruleExprSimple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprSimpleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprSimple=ruleExprSimple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprSimple; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprSimple"


    // $ANTLR start "ruleExprSimple"
    // InternalWhileDsl.g:1248:1: ruleExprSimple returns [EObject current=null] : ( ( (lv_term_0_0= RULE_VARIABLE ) ) | ( (lv_term_1_0= RULE_SYMBOL ) ) | ( (lv_term_2_0= 'nil' ) ) | ( (lv_expression_3_0= ruleExprSimpleWithLExpr ) ) | ( (lv_expression_4_0= ruleExprSimpleWithExpr ) ) | ( (lv_expression_5_0= ruleExprSimpleWithSymbolLExpr ) ) ) ;
    public final EObject ruleExprSimple() throws RecognitionException {
        EObject current = null;

        Token lv_term_0_0=null;
        Token lv_term_1_0=null;
        Token lv_term_2_0=null;
        EObject lv_expression_3_0 = null;

        EObject lv_expression_4_0 = null;

        EObject lv_expression_5_0 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:1254:2: ( ( ( (lv_term_0_0= RULE_VARIABLE ) ) | ( (lv_term_1_0= RULE_SYMBOL ) ) | ( (lv_term_2_0= 'nil' ) ) | ( (lv_expression_3_0= ruleExprSimpleWithLExpr ) ) | ( (lv_expression_4_0= ruleExprSimpleWithExpr ) ) | ( (lv_expression_5_0= ruleExprSimpleWithSymbolLExpr ) ) ) )
            // InternalWhileDsl.g:1255:2: ( ( (lv_term_0_0= RULE_VARIABLE ) ) | ( (lv_term_1_0= RULE_SYMBOL ) ) | ( (lv_term_2_0= 'nil' ) ) | ( (lv_expression_3_0= ruleExprSimpleWithLExpr ) ) | ( (lv_expression_4_0= ruleExprSimpleWithExpr ) ) | ( (lv_expression_5_0= ruleExprSimpleWithSymbolLExpr ) ) )
            {
            // InternalWhileDsl.g:1255:2: ( ( (lv_term_0_0= RULE_VARIABLE ) ) | ( (lv_term_1_0= RULE_SYMBOL ) ) | ( (lv_term_2_0= 'nil' ) ) | ( (lv_expression_3_0= ruleExprSimpleWithLExpr ) ) | ( (lv_expression_4_0= ruleExprSimpleWithExpr ) ) | ( (lv_expression_5_0= ruleExprSimpleWithSymbolLExpr ) ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case RULE_VARIABLE:
                {
                alt8=1;
                }
                break;
            case RULE_SYMBOL:
                {
                alt8=2;
                }
                break;
            case 36:
                {
                alt8=3;
                }
                break;
            case 37:
                {
                switch ( input.LA(2) ) {
                case 38:
                case 39:
                    {
                    alt8=4;
                    }
                    break;
                case 41:
                case 42:
                    {
                    alt8=5;
                    }
                    break;
                case RULE_SYMBOL:
                case RULE_SP:
                case RULE_CR:
                case RULE_TAB:
                case RULE_LF:
                    {
                    alt8=6;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 4, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalWhileDsl.g:1256:3: ( (lv_term_0_0= RULE_VARIABLE ) )
                    {
                    // InternalWhileDsl.g:1256:3: ( (lv_term_0_0= RULE_VARIABLE ) )
                    // InternalWhileDsl.g:1257:4: (lv_term_0_0= RULE_VARIABLE )
                    {
                    // InternalWhileDsl.g:1257:4: (lv_term_0_0= RULE_VARIABLE )
                    // InternalWhileDsl.g:1258:5: lv_term_0_0= RULE_VARIABLE
                    {
                    lv_term_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_term_0_0, grammarAccess.getExprSimpleAccess().getTermVARIABLETerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExprSimpleRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"term",
                      						lv_term_0_0,
                      						"esir.comp.cpp.WhileDsl.VARIABLE");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWhileDsl.g:1275:3: ( (lv_term_1_0= RULE_SYMBOL ) )
                    {
                    // InternalWhileDsl.g:1275:3: ( (lv_term_1_0= RULE_SYMBOL ) )
                    // InternalWhileDsl.g:1276:4: (lv_term_1_0= RULE_SYMBOL )
                    {
                    // InternalWhileDsl.g:1276:4: (lv_term_1_0= RULE_SYMBOL )
                    // InternalWhileDsl.g:1277:5: lv_term_1_0= RULE_SYMBOL
                    {
                    lv_term_1_0=(Token)match(input,RULE_SYMBOL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_term_1_0, grammarAccess.getExprSimpleAccess().getTermSYMBOLTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExprSimpleRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"term",
                      						lv_term_1_0,
                      						"esir.comp.cpp.WhileDsl.SYMBOL");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalWhileDsl.g:1294:3: ( (lv_term_2_0= 'nil' ) )
                    {
                    // InternalWhileDsl.g:1294:3: ( (lv_term_2_0= 'nil' ) )
                    // InternalWhileDsl.g:1295:4: (lv_term_2_0= 'nil' )
                    {
                    // InternalWhileDsl.g:1295:4: (lv_term_2_0= 'nil' )
                    // InternalWhileDsl.g:1296:5: lv_term_2_0= 'nil'
                    {
                    lv_term_2_0=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_term_2_0, grammarAccess.getExprSimpleAccess().getTermNilKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExprSimpleRule());
                      					}
                      					setWithLastConsumed(current, "term", lv_term_2_0, "nil");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalWhileDsl.g:1309:3: ( (lv_expression_3_0= ruleExprSimpleWithLExpr ) )
                    {
                    // InternalWhileDsl.g:1309:3: ( (lv_expression_3_0= ruleExprSimpleWithLExpr ) )
                    // InternalWhileDsl.g:1310:4: (lv_expression_3_0= ruleExprSimpleWithLExpr )
                    {
                    // InternalWhileDsl.g:1310:4: (lv_expression_3_0= ruleExprSimpleWithLExpr )
                    // InternalWhileDsl.g:1311:5: lv_expression_3_0= ruleExprSimpleWithLExpr
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExprSimpleAccess().getExpressionExprSimpleWithLExprParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_3_0=ruleExprSimpleWithLExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      					}
                      					set(
                      						current,
                      						"expression",
                      						lv_expression_3_0,
                      						"esir.comp.cpp.WhileDsl.ExprSimpleWithLExpr");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalWhileDsl.g:1329:3: ( (lv_expression_4_0= ruleExprSimpleWithExpr ) )
                    {
                    // InternalWhileDsl.g:1329:3: ( (lv_expression_4_0= ruleExprSimpleWithExpr ) )
                    // InternalWhileDsl.g:1330:4: (lv_expression_4_0= ruleExprSimpleWithExpr )
                    {
                    // InternalWhileDsl.g:1330:4: (lv_expression_4_0= ruleExprSimpleWithExpr )
                    // InternalWhileDsl.g:1331:5: lv_expression_4_0= ruleExprSimpleWithExpr
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExprSimpleAccess().getExpressionExprSimpleWithExprParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_4_0=ruleExprSimpleWithExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      					}
                      					set(
                      						current,
                      						"expression",
                      						lv_expression_4_0,
                      						"esir.comp.cpp.WhileDsl.ExprSimpleWithExpr");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalWhileDsl.g:1349:3: ( (lv_expression_5_0= ruleExprSimpleWithSymbolLExpr ) )
                    {
                    // InternalWhileDsl.g:1349:3: ( (lv_expression_5_0= ruleExprSimpleWithSymbolLExpr ) )
                    // InternalWhileDsl.g:1350:4: (lv_expression_5_0= ruleExprSimpleWithSymbolLExpr )
                    {
                    // InternalWhileDsl.g:1350:4: (lv_expression_5_0= ruleExprSimpleWithSymbolLExpr )
                    // InternalWhileDsl.g:1351:5: lv_expression_5_0= ruleExprSimpleWithSymbolLExpr
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExprSimpleAccess().getExpressionExprSimpleWithSymbolLExprParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_5_0=ruleExprSimpleWithSymbolLExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      					}
                      					set(
                      						current,
                      						"expression",
                      						lv_expression_5_0,
                      						"esir.comp.cpp.WhileDsl.ExprSimpleWithSymbolLExpr");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprSimple"


    // $ANTLR start "entryRuleExprSimpleWithLExpr"
    // InternalWhileDsl.g:1372:1: entryRuleExprSimpleWithLExpr returns [EObject current=null] : iv_ruleExprSimpleWithLExpr= ruleExprSimpleWithLExpr EOF ;
    public final EObject entryRuleExprSimpleWithLExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprSimpleWithLExpr = null;


        try {
            // InternalWhileDsl.g:1372:60: (iv_ruleExprSimpleWithLExpr= ruleExprSimpleWithLExpr EOF )
            // InternalWhileDsl.g:1373:2: iv_ruleExprSimpleWithLExpr= ruleExprSimpleWithLExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprSimpleWithLExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprSimpleWithLExpr=ruleExprSimpleWithLExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprSimpleWithLExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprSimpleWithLExpr"


    // $ANTLR start "ruleExprSimpleWithLExpr"
    // InternalWhileDsl.g:1379:1: ruleExprSimpleWithLExpr returns [EObject current=null] : (otherlv_0= '(' ( ( (lv_operation_1_1= 'cons' | lv_operation_1_2= 'list' ) ) ) ruleLC ( (lv_lexpr_3_0= ruleLExpr ) ) ruleLC otherlv_5= ')' ) ;
    public final EObject ruleExprSimpleWithLExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_operation_1_1=null;
        Token lv_operation_1_2=null;
        Token otherlv_5=null;
        EObject lv_lexpr_3_0 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:1385:2: ( (otherlv_0= '(' ( ( (lv_operation_1_1= 'cons' | lv_operation_1_2= 'list' ) ) ) ruleLC ( (lv_lexpr_3_0= ruleLExpr ) ) ruleLC otherlv_5= ')' ) )
            // InternalWhileDsl.g:1386:2: (otherlv_0= '(' ( ( (lv_operation_1_1= 'cons' | lv_operation_1_2= 'list' ) ) ) ruleLC ( (lv_lexpr_3_0= ruleLExpr ) ) ruleLC otherlv_5= ')' )
            {
            // InternalWhileDsl.g:1386:2: (otherlv_0= '(' ( ( (lv_operation_1_1= 'cons' | lv_operation_1_2= 'list' ) ) ) ruleLC ( (lv_lexpr_3_0= ruleLExpr ) ) ruleLC otherlv_5= ')' )
            // InternalWhileDsl.g:1387:3: otherlv_0= '(' ( ( (lv_operation_1_1= 'cons' | lv_operation_1_2= 'list' ) ) ) ruleLC ( (lv_lexpr_3_0= ruleLExpr ) ) ruleLC otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExprSimpleWithLExprAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalWhileDsl.g:1391:3: ( ( (lv_operation_1_1= 'cons' | lv_operation_1_2= 'list' ) ) )
            // InternalWhileDsl.g:1392:4: ( (lv_operation_1_1= 'cons' | lv_operation_1_2= 'list' ) )
            {
            // InternalWhileDsl.g:1392:4: ( (lv_operation_1_1= 'cons' | lv_operation_1_2= 'list' ) )
            // InternalWhileDsl.g:1393:5: (lv_operation_1_1= 'cons' | lv_operation_1_2= 'list' )
            {
            // InternalWhileDsl.g:1393:5: (lv_operation_1_1= 'cons' | lv_operation_1_2= 'list' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==38) ) {
                alt9=1;
            }
            else if ( (LA9_0==39) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalWhileDsl.g:1394:6: lv_operation_1_1= 'cons'
                    {
                    lv_operation_1_1=(Token)match(input,38,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_operation_1_1, grammarAccess.getExprSimpleWithLExprAccess().getOperationConsKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExprSimpleWithLExprRule());
                      						}
                      						setWithLastConsumed(current, "operation", lv_operation_1_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalWhileDsl.g:1405:6: lv_operation_1_2= 'list'
                    {
                    lv_operation_1_2=(Token)match(input,39,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_operation_1_2, grammarAccess.getExprSimpleWithLExprAccess().getOperationListKeyword_1_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExprSimpleWithLExprRule());
                      						}
                      						setWithLastConsumed(current, "operation", lv_operation_1_2, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExprSimpleWithLExprAccess().getLCParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_20);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:1425:3: ( (lv_lexpr_3_0= ruleLExpr ) )
            // InternalWhileDsl.g:1426:4: (lv_lexpr_3_0= ruleLExpr )
            {
            // InternalWhileDsl.g:1426:4: (lv_lexpr_3_0= ruleLExpr )
            // InternalWhileDsl.g:1427:5: lv_lexpr_3_0= ruleLExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprSimpleWithLExprAccess().getLexprLExprParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_38);
            lv_lexpr_3_0=ruleLExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprSimpleWithLExprRule());
              					}
              					set(
              						current,
              						"lexpr",
              						lv_lexpr_3_0,
              						"esir.comp.cpp.WhileDsl.LExpr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExprSimpleWithLExprAccess().getLCParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_39);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_5=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getExprSimpleWithLExprAccess().getRightParenthesisKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprSimpleWithLExpr"


    // $ANTLR start "entryRuleExprSimpleWithExpr"
    // InternalWhileDsl.g:1459:1: entryRuleExprSimpleWithExpr returns [EObject current=null] : iv_ruleExprSimpleWithExpr= ruleExprSimpleWithExpr EOF ;
    public final EObject entryRuleExprSimpleWithExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprSimpleWithExpr = null;


        try {
            // InternalWhileDsl.g:1459:59: (iv_ruleExprSimpleWithExpr= ruleExprSimpleWithExpr EOF )
            // InternalWhileDsl.g:1460:2: iv_ruleExprSimpleWithExpr= ruleExprSimpleWithExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprSimpleWithExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprSimpleWithExpr=ruleExprSimpleWithExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprSimpleWithExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprSimpleWithExpr"


    // $ANTLR start "ruleExprSimpleWithExpr"
    // InternalWhileDsl.g:1466:1: ruleExprSimpleWithExpr returns [EObject current=null] : (otherlv_0= '(' ( ( (lv_operation_1_1= 'hd' | lv_operation_1_2= 'tl' ) ) ) ruleLC ( (lv_expr_3_0= ruleExpr ) ) ruleLC otherlv_5= ')' ) ;
    public final EObject ruleExprSimpleWithExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_operation_1_1=null;
        Token lv_operation_1_2=null;
        Token otherlv_5=null;
        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:1472:2: ( (otherlv_0= '(' ( ( (lv_operation_1_1= 'hd' | lv_operation_1_2= 'tl' ) ) ) ruleLC ( (lv_expr_3_0= ruleExpr ) ) ruleLC otherlv_5= ')' ) )
            // InternalWhileDsl.g:1473:2: (otherlv_0= '(' ( ( (lv_operation_1_1= 'hd' | lv_operation_1_2= 'tl' ) ) ) ruleLC ( (lv_expr_3_0= ruleExpr ) ) ruleLC otherlv_5= ')' )
            {
            // InternalWhileDsl.g:1473:2: (otherlv_0= '(' ( ( (lv_operation_1_1= 'hd' | lv_operation_1_2= 'tl' ) ) ) ruleLC ( (lv_expr_3_0= ruleExpr ) ) ruleLC otherlv_5= ')' )
            // InternalWhileDsl.g:1474:3: otherlv_0= '(' ( ( (lv_operation_1_1= 'hd' | lv_operation_1_2= 'tl' ) ) ) ruleLC ( (lv_expr_3_0= ruleExpr ) ) ruleLC otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExprSimpleWithExprAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalWhileDsl.g:1478:3: ( ( (lv_operation_1_1= 'hd' | lv_operation_1_2= 'tl' ) ) )
            // InternalWhileDsl.g:1479:4: ( (lv_operation_1_1= 'hd' | lv_operation_1_2= 'tl' ) )
            {
            // InternalWhileDsl.g:1479:4: ( (lv_operation_1_1= 'hd' | lv_operation_1_2= 'tl' ) )
            // InternalWhileDsl.g:1480:5: (lv_operation_1_1= 'hd' | lv_operation_1_2= 'tl' )
            {
            // InternalWhileDsl.g:1480:5: (lv_operation_1_1= 'hd' | lv_operation_1_2= 'tl' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==41) ) {
                alt10=1;
            }
            else if ( (LA10_0==42) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalWhileDsl.g:1481:6: lv_operation_1_1= 'hd'
                    {
                    lv_operation_1_1=(Token)match(input,41,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_operation_1_1, grammarAccess.getExprSimpleWithExprAccess().getOperationHdKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExprSimpleWithExprRule());
                      						}
                      						setWithLastConsumed(current, "operation", lv_operation_1_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalWhileDsl.g:1492:6: lv_operation_1_2= 'tl'
                    {
                    lv_operation_1_2=(Token)match(input,42,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_operation_1_2, grammarAccess.getExprSimpleWithExprAccess().getOperationTlKeyword_1_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExprSimpleWithExprRule());
                      						}
                      						setWithLastConsumed(current, "operation", lv_operation_1_2, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExprSimpleWithExprAccess().getLCParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_20);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:1512:3: ( (lv_expr_3_0= ruleExpr ) )
            // InternalWhileDsl.g:1513:4: (lv_expr_3_0= ruleExpr )
            {
            // InternalWhileDsl.g:1513:4: (lv_expr_3_0= ruleExpr )
            // InternalWhileDsl.g:1514:5: lv_expr_3_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprSimpleWithExprAccess().getExprExprParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_38);
            lv_expr_3_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprSimpleWithExprRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_3_0,
              						"esir.comp.cpp.WhileDsl.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExprSimpleWithExprAccess().getLCParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_39);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_5=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getExprSimpleWithExprAccess().getRightParenthesisKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprSimpleWithExpr"


    // $ANTLR start "entryRuleExprSimpleWithSymbolLExpr"
    // InternalWhileDsl.g:1546:1: entryRuleExprSimpleWithSymbolLExpr returns [EObject current=null] : iv_ruleExprSimpleWithSymbolLExpr= ruleExprSimpleWithSymbolLExpr EOF ;
    public final EObject entryRuleExprSimpleWithSymbolLExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprSimpleWithSymbolLExpr = null;


        try {
            // InternalWhileDsl.g:1546:66: (iv_ruleExprSimpleWithSymbolLExpr= ruleExprSimpleWithSymbolLExpr EOF )
            // InternalWhileDsl.g:1547:2: iv_ruleExprSimpleWithSymbolLExpr= ruleExprSimpleWithSymbolLExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprSimpleWithSymbolLExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprSimpleWithSymbolLExpr=ruleExprSimpleWithSymbolLExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprSimpleWithSymbolLExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprSimpleWithSymbolLExpr"


    // $ANTLR start "ruleExprSimpleWithSymbolLExpr"
    // InternalWhileDsl.g:1553:1: ruleExprSimpleWithSymbolLExpr returns [EObject current=null] : (otherlv_0= '(' ruleLC ( (lv_symbol_2_0= RULE_SYMBOL ) ) ruleLC ( (lv_lexpr_4_0= ruleLExpr ) ) ruleLC otherlv_6= ')' ) ;
    public final EObject ruleExprSimpleWithSymbolLExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_symbol_2_0=null;
        Token otherlv_6=null;
        EObject lv_lexpr_4_0 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:1559:2: ( (otherlv_0= '(' ruleLC ( (lv_symbol_2_0= RULE_SYMBOL ) ) ruleLC ( (lv_lexpr_4_0= ruleLExpr ) ) ruleLC otherlv_6= ')' ) )
            // InternalWhileDsl.g:1560:2: (otherlv_0= '(' ruleLC ( (lv_symbol_2_0= RULE_SYMBOL ) ) ruleLC ( (lv_lexpr_4_0= ruleLExpr ) ) ruleLC otherlv_6= ')' )
            {
            // InternalWhileDsl.g:1560:2: (otherlv_0= '(' ruleLC ( (lv_symbol_2_0= RULE_SYMBOL ) ) ruleLC ( (lv_lexpr_4_0= ruleLExpr ) ) ruleLC otherlv_6= ')' )
            // InternalWhileDsl.g:1561:3: otherlv_0= '(' ruleLC ( (lv_symbol_2_0= RULE_SYMBOL ) ) ruleLC ( (lv_lexpr_4_0= ruleLExpr ) ) ruleLC otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExprSimpleWithSymbolLExprAccess().getLeftParenthesisKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExprSimpleWithSymbolLExprAccess().getLCParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_5);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:1572:3: ( (lv_symbol_2_0= RULE_SYMBOL ) )
            // InternalWhileDsl.g:1573:4: (lv_symbol_2_0= RULE_SYMBOL )
            {
            // InternalWhileDsl.g:1573:4: (lv_symbol_2_0= RULE_SYMBOL )
            // InternalWhileDsl.g:1574:5: lv_symbol_2_0= RULE_SYMBOL
            {
            lv_symbol_2_0=(Token)match(input,RULE_SYMBOL,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_symbol_2_0, grammarAccess.getExprSimpleWithSymbolLExprAccess().getSymbolSYMBOLTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getExprSimpleWithSymbolLExprRule());
              					}
              					setWithLastConsumed(
              						current,
              						"symbol",
              						lv_symbol_2_0,
              						"esir.comp.cpp.WhileDsl.SYMBOL");
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExprSimpleWithSymbolLExprAccess().getLCParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_20);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:1597:3: ( (lv_lexpr_4_0= ruleLExpr ) )
            // InternalWhileDsl.g:1598:4: (lv_lexpr_4_0= ruleLExpr )
            {
            // InternalWhileDsl.g:1598:4: (lv_lexpr_4_0= ruleLExpr )
            // InternalWhileDsl.g:1599:5: lv_lexpr_4_0= ruleLExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprSimpleWithSymbolLExprAccess().getLexprLExprParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_38);
            lv_lexpr_4_0=ruleLExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprSimpleWithSymbolLExprRule());
              					}
              					set(
              						current,
              						"lexpr",
              						lv_lexpr_4_0,
              						"esir.comp.cpp.WhileDsl.LExpr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExprSimpleWithSymbolLExprAccess().getLCParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_39);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_6=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getExprSimpleWithSymbolLExprAccess().getRightParenthesisKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprSimpleWithSymbolLExpr"


    // $ANTLR start "entryRuleLExpr"
    // InternalWhileDsl.g:1631:1: entryRuleLExpr returns [EObject current=null] : iv_ruleLExpr= ruleLExpr EOF ;
    public final EObject entryRuleLExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLExpr = null;


        try {
            // InternalWhileDsl.g:1631:46: (iv_ruleLExpr= ruleLExpr EOF )
            // InternalWhileDsl.g:1632:2: iv_ruleLExpr= ruleLExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLExpr=ruleLExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLExpr"


    // $ANTLR start "ruleLExpr"
    // InternalWhileDsl.g:1638:1: ruleLExpr returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleExpr ) ) ( ruleLC ( (lv_expressions_2_0= ruleExpr ) ) )* ) ;
    public final EObject ruleLExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:1644:2: ( ( ( (lv_expressions_0_0= ruleExpr ) ) ( ruleLC ( (lv_expressions_2_0= ruleExpr ) ) )* ) )
            // InternalWhileDsl.g:1645:2: ( ( (lv_expressions_0_0= ruleExpr ) ) ( ruleLC ( (lv_expressions_2_0= ruleExpr ) ) )* )
            {
            // InternalWhileDsl.g:1645:2: ( ( (lv_expressions_0_0= ruleExpr ) ) ( ruleLC ( (lv_expressions_2_0= ruleExpr ) ) )* )
            // InternalWhileDsl.g:1646:3: ( (lv_expressions_0_0= ruleExpr ) ) ( ruleLC ( (lv_expressions_2_0= ruleExpr ) ) )*
            {
            // InternalWhileDsl.g:1646:3: ( (lv_expressions_0_0= ruleExpr ) )
            // InternalWhileDsl.g:1647:4: (lv_expressions_0_0= ruleExpr )
            {
            // InternalWhileDsl.g:1647:4: (lv_expressions_0_0= ruleExpr )
            // InternalWhileDsl.g:1648:5: lv_expressions_0_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLExprAccess().getExpressionsExprParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_41);
            lv_expressions_0_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLExprRule());
              					}
              					add(
              						current,
              						"expressions",
              						lv_expressions_0_0,
              						"esir.comp.cpp.WhileDsl.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalWhileDsl.g:1665:3: ( ruleLC ( (lv_expressions_2_0= ruleExpr ) ) )*
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // InternalWhileDsl.g:1666:4: ruleLC ( (lv_expressions_2_0= ruleExpr ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getLExprAccess().getLCParserRuleCall_1_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_20);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalWhileDsl.g:1673:4: ( (lv_expressions_2_0= ruleExpr ) )
            	    // InternalWhileDsl.g:1674:5: (lv_expressions_2_0= ruleExpr )
            	    {
            	    // InternalWhileDsl.g:1674:5: (lv_expressions_2_0= ruleExpr )
            	    // InternalWhileDsl.g:1675:6: lv_expressions_2_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLExprAccess().getExpressionsExprParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_41);
            	    lv_expressions_2_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLExprRule());
            	      						}
            	      						add(
            	      							current,
            	      							"expressions",
            	      							lv_expressions_2_0,
            	      							"esir.comp.cpp.WhileDsl.Expr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLExpr"


    // $ANTLR start "entryRuleExprs"
    // InternalWhileDsl.g:1697:1: entryRuleExprs returns [EObject current=null] : iv_ruleExprs= ruleExprs EOF ;
    public final EObject entryRuleExprs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprs = null;


        try {
            // InternalWhileDsl.g:1697:46: (iv_ruleExprs= ruleExprs EOF )
            // InternalWhileDsl.g:1698:2: iv_ruleExprs= ruleExprs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprs=ruleExprs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprs; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprs"


    // $ANTLR start "ruleExprs"
    // InternalWhileDsl.g:1704:1: ruleExprs returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleExpr ) ) (otherlv_1= ',' ruleLC ( (lv_expressions_3_0= ruleExpr ) ) )* ) ;
    public final EObject ruleExprs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_3_0 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:1710:2: ( ( ( (lv_expressions_0_0= ruleExpr ) ) (otherlv_1= ',' ruleLC ( (lv_expressions_3_0= ruleExpr ) ) )* ) )
            // InternalWhileDsl.g:1711:2: ( ( (lv_expressions_0_0= ruleExpr ) ) (otherlv_1= ',' ruleLC ( (lv_expressions_3_0= ruleExpr ) ) )* )
            {
            // InternalWhileDsl.g:1711:2: ( ( (lv_expressions_0_0= ruleExpr ) ) (otherlv_1= ',' ruleLC ( (lv_expressions_3_0= ruleExpr ) ) )* )
            // InternalWhileDsl.g:1712:3: ( (lv_expressions_0_0= ruleExpr ) ) (otherlv_1= ',' ruleLC ( (lv_expressions_3_0= ruleExpr ) ) )*
            {
            // InternalWhileDsl.g:1712:3: ( (lv_expressions_0_0= ruleExpr ) )
            // InternalWhileDsl.g:1713:4: (lv_expressions_0_0= ruleExpr )
            {
            // InternalWhileDsl.g:1713:4: (lv_expressions_0_0= ruleExpr )
            // InternalWhileDsl.g:1714:5: lv_expressions_0_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprsAccess().getExpressionsExprParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_expressions_0_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprsRule());
              					}
              					add(
              						current,
              						"expressions",
              						lv_expressions_0_0,
              						"esir.comp.cpp.WhileDsl.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalWhileDsl.g:1731:3: (otherlv_1= ',' ruleLC ( (lv_expressions_3_0= ruleExpr ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalWhileDsl.g:1732:4: otherlv_1= ',' ruleLC ( (lv_expressions_3_0= ruleExpr ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getExprsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getExprsAccess().getLCParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_20);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalWhileDsl.g:1743:4: ( (lv_expressions_3_0= ruleExpr ) )
            	    // InternalWhileDsl.g:1744:5: (lv_expressions_3_0= ruleExpr )
            	    {
            	    // InternalWhileDsl.g:1744:5: (lv_expressions_3_0= ruleExpr )
            	    // InternalWhileDsl.g:1745:6: lv_expressions_3_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExprsAccess().getExpressionsExprParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_expressions_3_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExprsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"expressions",
            	      							lv_expressions_3_0,
            	      							"esir.comp.cpp.WhileDsl.Expr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprs"


    // $ANTLR start "entryRuleExpr"
    // InternalWhileDsl.g:1767:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalWhileDsl.g:1767:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalWhileDsl.g:1768:2: iv_ruleExpr= ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpr=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalWhileDsl.g:1774:1: ruleExpr returns [EObject current=null] : ( ( ( ( ( ruleExprAnd ) ) )=> ( (lv_expression_0_0= ruleExprAnd ) ) ) | ( (lv_expression_1_0= ruleExprSimple ) ) ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;

        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:1780:2: ( ( ( ( ( ( ruleExprAnd ) ) )=> ( (lv_expression_0_0= ruleExprAnd ) ) ) | ( (lv_expression_1_0= ruleExprSimple ) ) ) )
            // InternalWhileDsl.g:1781:2: ( ( ( ( ( ruleExprAnd ) ) )=> ( (lv_expression_0_0= ruleExprAnd ) ) ) | ( (lv_expression_1_0= ruleExprSimple ) ) )
            {
            // InternalWhileDsl.g:1781:2: ( ( ( ( ( ruleExprAnd ) ) )=> ( (lv_expression_0_0= ruleExprAnd ) ) ) | ( (lv_expression_1_0= ruleExprSimple ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==45) && (synpred1_InternalWhileDsl())) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_VARIABLE) ) {
                int LA13_2 = input.LA(2);

                if ( (synpred1_InternalWhileDsl()) ) {
                    alt13=1;
                }
                else if ( (true) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }
            }
            else if ( (LA13_0==RULE_SYMBOL) ) {
                int LA13_3 = input.LA(2);

                if ( (synpred1_InternalWhileDsl()) ) {
                    alt13=1;
                }
                else if ( (true) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 3, input);

                    throw nvae;
                }
            }
            else if ( (LA13_0==36) ) {
                int LA13_4 = input.LA(2);

                if ( (synpred1_InternalWhileDsl()) ) {
                    alt13=1;
                }
                else if ( (true) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 4, input);

                    throw nvae;
                }
            }
            else if ( (LA13_0==37) ) {
                int LA13_5 = input.LA(2);

                if ( (synpred1_InternalWhileDsl()) ) {
                    alt13=1;
                }
                else if ( (true) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 5, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalWhileDsl.g:1782:3: ( ( ( ( ruleExprAnd ) ) )=> ( (lv_expression_0_0= ruleExprAnd ) ) )
                    {
                    // InternalWhileDsl.g:1782:3: ( ( ( ( ruleExprAnd ) ) )=> ( (lv_expression_0_0= ruleExprAnd ) ) )
                    // InternalWhileDsl.g:1783:4: ( ( ( ruleExprAnd ) ) )=> ( (lv_expression_0_0= ruleExprAnd ) )
                    {
                    // InternalWhileDsl.g:1789:4: ( (lv_expression_0_0= ruleExprAnd ) )
                    // InternalWhileDsl.g:1790:5: (lv_expression_0_0= ruleExprAnd )
                    {
                    // InternalWhileDsl.g:1790:5: (lv_expression_0_0= ruleExprAnd )
                    // InternalWhileDsl.g:1791:6: lv_expression_0_0= ruleExprAnd
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprAccess().getExpressionExprAndParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_0_0=ruleExprAnd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_0_0,
                      							"esir.comp.cpp.WhileDsl.ExprAnd");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWhileDsl.g:1810:3: ( (lv_expression_1_0= ruleExprSimple ) )
                    {
                    // InternalWhileDsl.g:1810:3: ( (lv_expression_1_0= ruleExprSimple ) )
                    // InternalWhileDsl.g:1811:4: (lv_expression_1_0= ruleExprSimple )
                    {
                    // InternalWhileDsl.g:1811:4: (lv_expression_1_0= ruleExprSimple )
                    // InternalWhileDsl.g:1812:5: lv_expression_1_0= ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExprAccess().getExpressionExprSimpleParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_1_0=ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExprRule());
                      					}
                      					set(
                      						current,
                      						"expression",
                      						lv_expression_1_0,
                      						"esir.comp.cpp.WhileDsl.ExprSimple");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleExprAnd"
    // InternalWhileDsl.g:1833:1: entryRuleExprAnd returns [EObject current=null] : iv_ruleExprAnd= ruleExprAnd EOF ;
    public final EObject entryRuleExprAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAnd = null;


        try {
            // InternalWhileDsl.g:1833:48: (iv_ruleExprAnd= ruleExprAnd EOF )
            // InternalWhileDsl.g:1834:2: iv_ruleExprAnd= ruleExprAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprAnd=ruleExprAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprAnd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprAnd"


    // $ANTLR start "ruleExprAnd"
    // InternalWhileDsl.g:1840:1: ruleExprAnd returns [EObject current=null] : ( ( (lv_expressionsOr_0_0= ruleExprOr ) ) ( ruleLC otherlv_2= 'and' ruleLC ( (lv_expressionsOr_4_0= ruleExprOr ) ) )* ) ;
    public final EObject ruleExprAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressionsOr_0_0 = null;

        EObject lv_expressionsOr_4_0 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:1846:2: ( ( ( (lv_expressionsOr_0_0= ruleExprOr ) ) ( ruleLC otherlv_2= 'and' ruleLC ( (lv_expressionsOr_4_0= ruleExprOr ) ) )* ) )
            // InternalWhileDsl.g:1847:2: ( ( (lv_expressionsOr_0_0= ruleExprOr ) ) ( ruleLC otherlv_2= 'and' ruleLC ( (lv_expressionsOr_4_0= ruleExprOr ) ) )* )
            {
            // InternalWhileDsl.g:1847:2: ( ( (lv_expressionsOr_0_0= ruleExprOr ) ) ( ruleLC otherlv_2= 'and' ruleLC ( (lv_expressionsOr_4_0= ruleExprOr ) ) )* )
            // InternalWhileDsl.g:1848:3: ( (lv_expressionsOr_0_0= ruleExprOr ) ) ( ruleLC otherlv_2= 'and' ruleLC ( (lv_expressionsOr_4_0= ruleExprOr ) ) )*
            {
            // InternalWhileDsl.g:1848:3: ( (lv_expressionsOr_0_0= ruleExprOr ) )
            // InternalWhileDsl.g:1849:4: (lv_expressionsOr_0_0= ruleExprOr )
            {
            // InternalWhileDsl.g:1849:4: (lv_expressionsOr_0_0= ruleExprOr )
            // InternalWhileDsl.g:1850:5: lv_expressionsOr_0_0= ruleExprOr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprAndAccess().getExpressionsOrExprOrParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_42);
            lv_expressionsOr_0_0=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprAndRule());
              					}
              					add(
              						current,
              						"expressionsOr",
              						lv_expressionsOr_0_0,
              						"esir.comp.cpp.WhileDsl.ExprOr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalWhileDsl.g:1867:3: ( ruleLC otherlv_2= 'and' ruleLC ( (lv_expressionsOr_4_0= ruleExprOr ) ) )*
            loop14:
            do {
                int alt14=2;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // InternalWhileDsl.g:1868:4: ruleLC otherlv_2= 'and' ruleLC ( (lv_expressionsOr_4_0= ruleExprOr ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getExprAndAccess().getLCParserRuleCall_1_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_43);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    otherlv_2=(Token)match(input,43,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getExprAndAccess().getAndKeyword_1_1());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getExprAndAccess().getLCParserRuleCall_1_2());
            	      			
            	    }
            	    pushFollow(FOLLOW_44);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalWhileDsl.g:1886:4: ( (lv_expressionsOr_4_0= ruleExprOr ) )
            	    // InternalWhileDsl.g:1887:5: (lv_expressionsOr_4_0= ruleExprOr )
            	    {
            	    // InternalWhileDsl.g:1887:5: (lv_expressionsOr_4_0= ruleExprOr )
            	    // InternalWhileDsl.g:1888:6: lv_expressionsOr_4_0= ruleExprOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExprAndAccess().getExpressionsOrExprOrParserRuleCall_1_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_42);
            	    lv_expressionsOr_4_0=ruleExprOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExprAndRule());
            	      						}
            	      						add(
            	      							current,
            	      							"expressionsOr",
            	      							lv_expressionsOr_4_0,
            	      							"esir.comp.cpp.WhileDsl.ExprOr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprAnd"


    // $ANTLR start "entryRuleExprOr"
    // InternalWhileDsl.g:1910:1: entryRuleExprOr returns [EObject current=null] : iv_ruleExprOr= ruleExprOr EOF ;
    public final EObject entryRuleExprOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprOr = null;


        try {
            // InternalWhileDsl.g:1910:47: (iv_ruleExprOr= ruleExprOr EOF )
            // InternalWhileDsl.g:1911:2: iv_ruleExprOr= ruleExprOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprOr=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprOr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprOr"


    // $ANTLR start "ruleExprOr"
    // InternalWhileDsl.g:1917:1: ruleExprOr returns [EObject current=null] : ( ( (lv_expressionsNot_0_0= ruleExprNot ) ) ( ruleLC otherlv_2= 'or' ruleLC ( (lv_expressionsNot_4_0= ruleExprNot ) ) )* ) ;
    public final EObject ruleExprOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressionsNot_0_0 = null;

        EObject lv_expressionsNot_4_0 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:1923:2: ( ( ( (lv_expressionsNot_0_0= ruleExprNot ) ) ( ruleLC otherlv_2= 'or' ruleLC ( (lv_expressionsNot_4_0= ruleExprNot ) ) )* ) )
            // InternalWhileDsl.g:1924:2: ( ( (lv_expressionsNot_0_0= ruleExprNot ) ) ( ruleLC otherlv_2= 'or' ruleLC ( (lv_expressionsNot_4_0= ruleExprNot ) ) )* )
            {
            // InternalWhileDsl.g:1924:2: ( ( (lv_expressionsNot_0_0= ruleExprNot ) ) ( ruleLC otherlv_2= 'or' ruleLC ( (lv_expressionsNot_4_0= ruleExprNot ) ) )* )
            // InternalWhileDsl.g:1925:3: ( (lv_expressionsNot_0_0= ruleExprNot ) ) ( ruleLC otherlv_2= 'or' ruleLC ( (lv_expressionsNot_4_0= ruleExprNot ) ) )*
            {
            // InternalWhileDsl.g:1925:3: ( (lv_expressionsNot_0_0= ruleExprNot ) )
            // InternalWhileDsl.g:1926:4: (lv_expressionsNot_0_0= ruleExprNot )
            {
            // InternalWhileDsl.g:1926:4: (lv_expressionsNot_0_0= ruleExprNot )
            // InternalWhileDsl.g:1927:5: lv_expressionsNot_0_0= ruleExprNot
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprOrAccess().getExpressionsNotExprNotParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_45);
            lv_expressionsNot_0_0=ruleExprNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprOrRule());
              					}
              					add(
              						current,
              						"expressionsNot",
              						lv_expressionsNot_0_0,
              						"esir.comp.cpp.WhileDsl.ExprNot");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalWhileDsl.g:1944:3: ( ruleLC otherlv_2= 'or' ruleLC ( (lv_expressionsNot_4_0= ruleExprNot ) ) )*
            loop15:
            do {
                int alt15=2;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // InternalWhileDsl.g:1945:4: ruleLC otherlv_2= 'or' ruleLC ( (lv_expressionsNot_4_0= ruleExprNot ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getExprOrAccess().getLCParserRuleCall_1_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_46);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    otherlv_2=(Token)match(input,44,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getExprOrAccess().getOrKeyword_1_1());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getExprOrAccess().getLCParserRuleCall_1_2());
            	      			
            	    }
            	    pushFollow(FOLLOW_44);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalWhileDsl.g:1963:4: ( (lv_expressionsNot_4_0= ruleExprNot ) )
            	    // InternalWhileDsl.g:1964:5: (lv_expressionsNot_4_0= ruleExprNot )
            	    {
            	    // InternalWhileDsl.g:1964:5: (lv_expressionsNot_4_0= ruleExprNot )
            	    // InternalWhileDsl.g:1965:6: lv_expressionsNot_4_0= ruleExprNot
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExprOrAccess().getExpressionsNotExprNotParserRuleCall_1_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_45);
            	    lv_expressionsNot_4_0=ruleExprNot();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExprOrRule());
            	      						}
            	      						add(
            	      							current,
            	      							"expressionsNot",
            	      							lv_expressionsNot_4_0,
            	      							"esir.comp.cpp.WhileDsl.ExprNot");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprOr"


    // $ANTLR start "entryRuleExprNot"
    // InternalWhileDsl.g:1987:1: entryRuleExprNot returns [EObject current=null] : iv_ruleExprNot= ruleExprNot EOF ;
    public final EObject entryRuleExprNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprNot = null;


        try {
            // InternalWhileDsl.g:1987:48: (iv_ruleExprNot= ruleExprNot EOF )
            // InternalWhileDsl.g:1988:2: iv_ruleExprNot= ruleExprNot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprNotRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprNot=ruleExprNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprNot; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprNot"


    // $ANTLR start "ruleExprNot"
    // InternalWhileDsl.g:1994:1: ruleExprNot returns [EObject current=null] : ( ( ( (lv_negation_0_0= 'not' ) ) ruleLC )? ( (lv_expressionEq_2_0= ruleExprEq ) ) ) ;
    public final EObject ruleExprNot() throws RecognitionException {
        EObject current = null;

        Token lv_negation_0_0=null;
        EObject lv_expressionEq_2_0 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:2000:2: ( ( ( ( (lv_negation_0_0= 'not' ) ) ruleLC )? ( (lv_expressionEq_2_0= ruleExprEq ) ) ) )
            // InternalWhileDsl.g:2001:2: ( ( ( (lv_negation_0_0= 'not' ) ) ruleLC )? ( (lv_expressionEq_2_0= ruleExprEq ) ) )
            {
            // InternalWhileDsl.g:2001:2: ( ( ( (lv_negation_0_0= 'not' ) ) ruleLC )? ( (lv_expressionEq_2_0= ruleExprEq ) ) )
            // InternalWhileDsl.g:2002:3: ( ( (lv_negation_0_0= 'not' ) ) ruleLC )? ( (lv_expressionEq_2_0= ruleExprEq ) )
            {
            // InternalWhileDsl.g:2002:3: ( ( (lv_negation_0_0= 'not' ) ) ruleLC )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==45) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalWhileDsl.g:2003:4: ( (lv_negation_0_0= 'not' ) ) ruleLC
                    {
                    // InternalWhileDsl.g:2003:4: ( (lv_negation_0_0= 'not' ) )
                    // InternalWhileDsl.g:2004:5: (lv_negation_0_0= 'not' )
                    {
                    // InternalWhileDsl.g:2004:5: (lv_negation_0_0= 'not' )
                    // InternalWhileDsl.g:2005:6: lv_negation_0_0= 'not'
                    {
                    lv_negation_0_0=(Token)match(input,45,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_negation_0_0, grammarAccess.getExprNotAccess().getNegationNotKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExprNotRule());
                      						}
                      						setWithLastConsumed(current, "negation", true, "not");
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExprNotAccess().getLCParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_44);
                    ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalWhileDsl.g:2025:3: ( (lv_expressionEq_2_0= ruleExprEq ) )
            // InternalWhileDsl.g:2026:4: (lv_expressionEq_2_0= ruleExprEq )
            {
            // InternalWhileDsl.g:2026:4: (lv_expressionEq_2_0= ruleExprEq )
            // InternalWhileDsl.g:2027:5: lv_expressionEq_2_0= ruleExprEq
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprNotAccess().getExpressionEqExprEqParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expressionEq_2_0=ruleExprEq();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprNotRule());
              					}
              					set(
              						current,
              						"expressionEq",
              						lv_expressionEq_2_0,
              						"esir.comp.cpp.WhileDsl.ExprEq");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprNot"


    // $ANTLR start "entryRuleExprEq"
    // InternalWhileDsl.g:2048:1: entryRuleExprEq returns [EObject current=null] : iv_ruleExprEq= ruleExprEq EOF ;
    public final EObject entryRuleExprEq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprEq = null;


        try {
            // InternalWhileDsl.g:2048:47: (iv_ruleExprEq= ruleExprEq EOF )
            // InternalWhileDsl.g:2049:2: iv_ruleExprEq= ruleExprEq EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprEqRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprEq=ruleExprEq();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprEq; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprEq"


    // $ANTLR start "ruleExprEq"
    // InternalWhileDsl.g:2055:1: ruleExprEq returns [EObject current=null] : ( ( (lv_exprL_0_0= ruleExprSimple ) ) ruleLC otherlv_2= '=?' ruleLC ( ( (lv_exprRSimple_4_0= ruleExprSimple ) ) | (otherlv_5= '(' ( (lv_exprRExpr_6_0= ruleExpr ) ) otherlv_7= ')' ) ) ) ;
    public final EObject ruleExprEq() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_exprL_0_0 = null;

        EObject lv_exprRSimple_4_0 = null;

        EObject lv_exprRExpr_6_0 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:2061:2: ( ( ( (lv_exprL_0_0= ruleExprSimple ) ) ruleLC otherlv_2= '=?' ruleLC ( ( (lv_exprRSimple_4_0= ruleExprSimple ) ) | (otherlv_5= '(' ( (lv_exprRExpr_6_0= ruleExpr ) ) otherlv_7= ')' ) ) ) )
            // InternalWhileDsl.g:2062:2: ( ( (lv_exprL_0_0= ruleExprSimple ) ) ruleLC otherlv_2= '=?' ruleLC ( ( (lv_exprRSimple_4_0= ruleExprSimple ) ) | (otherlv_5= '(' ( (lv_exprRExpr_6_0= ruleExpr ) ) otherlv_7= ')' ) ) )
            {
            // InternalWhileDsl.g:2062:2: ( ( (lv_exprL_0_0= ruleExprSimple ) ) ruleLC otherlv_2= '=?' ruleLC ( ( (lv_exprRSimple_4_0= ruleExprSimple ) ) | (otherlv_5= '(' ( (lv_exprRExpr_6_0= ruleExpr ) ) otherlv_7= ')' ) ) )
            // InternalWhileDsl.g:2063:3: ( (lv_exprL_0_0= ruleExprSimple ) ) ruleLC otherlv_2= '=?' ruleLC ( ( (lv_exprRSimple_4_0= ruleExprSimple ) ) | (otherlv_5= '(' ( (lv_exprRExpr_6_0= ruleExpr ) ) otherlv_7= ')' ) )
            {
            // InternalWhileDsl.g:2063:3: ( (lv_exprL_0_0= ruleExprSimple ) )
            // InternalWhileDsl.g:2064:4: (lv_exprL_0_0= ruleExprSimple )
            {
            // InternalWhileDsl.g:2064:4: (lv_exprL_0_0= ruleExprSimple )
            // InternalWhileDsl.g:2065:5: lv_exprL_0_0= ruleExprSimple
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprEqAccess().getExprLExprSimpleParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_47);
            lv_exprL_0_0=ruleExprSimple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprEqRule());
              					}
              					set(
              						current,
              						"exprL",
              						lv_exprL_0_0,
              						"esir.comp.cpp.WhileDsl.ExprSimple");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExprEqAccess().getLCParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_48);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,46,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getExprEqAccess().getEqualsSignQuestionMarkKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExprEqAccess().getLCParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_44);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:2100:3: ( ( (lv_exprRSimple_4_0= ruleExprSimple ) ) | (otherlv_5= '(' ( (lv_exprRExpr_6_0= ruleExpr ) ) otherlv_7= ')' ) )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalWhileDsl.g:2101:4: ( (lv_exprRSimple_4_0= ruleExprSimple ) )
                    {
                    // InternalWhileDsl.g:2101:4: ( (lv_exprRSimple_4_0= ruleExprSimple ) )
                    // InternalWhileDsl.g:2102:5: (lv_exprRSimple_4_0= ruleExprSimple )
                    {
                    // InternalWhileDsl.g:2102:5: (lv_exprRSimple_4_0= ruleExprSimple )
                    // InternalWhileDsl.g:2103:6: lv_exprRSimple_4_0= ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprEqAccess().getExprRSimpleExprSimpleParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_exprRSimple_4_0=ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprEqRule());
                      						}
                      						set(
                      							current,
                      							"exprRSimple",
                      							lv_exprRSimple_4_0,
                      							"esir.comp.cpp.WhileDsl.ExprSimple");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWhileDsl.g:2121:4: (otherlv_5= '(' ( (lv_exprRExpr_6_0= ruleExpr ) ) otherlv_7= ')' )
                    {
                    // InternalWhileDsl.g:2121:4: (otherlv_5= '(' ( (lv_exprRExpr_6_0= ruleExpr ) ) otherlv_7= ')' )
                    // InternalWhileDsl.g:2122:5: otherlv_5= '(' ( (lv_exprRExpr_6_0= ruleExpr ) ) otherlv_7= ')'
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getExprEqAccess().getLeftParenthesisKeyword_4_1_0());
                      				
                    }
                    // InternalWhileDsl.g:2126:5: ( (lv_exprRExpr_6_0= ruleExpr ) )
                    // InternalWhileDsl.g:2127:6: (lv_exprRExpr_6_0= ruleExpr )
                    {
                    // InternalWhileDsl.g:2127:6: (lv_exprRExpr_6_0= ruleExpr )
                    // InternalWhileDsl.g:2128:7: lv_exprRExpr_6_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getExprEqAccess().getExprRExprExprParserRuleCall_4_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_39);
                    lv_exprRExpr_6_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getExprEqRule());
                      							}
                      							set(
                      								current,
                      								"exprRExpr",
                      								lv_exprRExpr_6_0,
                      								"esir.comp.cpp.WhileDsl.Expr");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getExprEqAccess().getRightParenthesisKeyword_4_1_2());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprEq"


    // $ANTLR start "entryRuleLC"
    // InternalWhileDsl.g:2155:1: entryRuleLC returns [String current=null] : iv_ruleLC= ruleLC EOF ;
    public final String entryRuleLC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLC = null;


        try {
            // InternalWhileDsl.g:2155:42: (iv_ruleLC= ruleLC EOF )
            // InternalWhileDsl.g:2156:2: iv_ruleLC= ruleLC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLCRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLC=ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLC.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLC"


    // $ANTLR start "ruleLC"
    // InternalWhileDsl.g:2162:1: ruleLC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SP_0= RULE_SP | this_CR_1= RULE_CR | this_TAB_2= RULE_TAB | this_LF_3= RULE_LF )* ;
    public final AntlrDatatypeRuleToken ruleLC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SP_0=null;
        Token this_CR_1=null;
        Token this_TAB_2=null;
        Token this_LF_3=null;


        	enterRule();

        try {
            // InternalWhileDsl.g:2168:2: ( (this_SP_0= RULE_SP | this_CR_1= RULE_CR | this_TAB_2= RULE_TAB | this_LF_3= RULE_LF )* )
            // InternalWhileDsl.g:2169:2: (this_SP_0= RULE_SP | this_CR_1= RULE_CR | this_TAB_2= RULE_TAB | this_LF_3= RULE_LF )*
            {
            // InternalWhileDsl.g:2169:2: (this_SP_0= RULE_SP | this_CR_1= RULE_CR | this_TAB_2= RULE_TAB | this_LF_3= RULE_LF )*
            loop18:
            do {
                int alt18=5;
                switch ( input.LA(1) ) {
                case RULE_SP:
                    {
                    alt18=1;
                    }
                    break;
                case RULE_CR:
                    {
                    alt18=2;
                    }
                    break;
                case RULE_TAB:
                    {
                    alt18=3;
                    }
                    break;
                case RULE_LF:
                    {
                    alt18=4;
                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // InternalWhileDsl.g:2170:3: this_SP_0= RULE_SP
            	    {
            	    this_SP_0=(Token)match(input,RULE_SP,FOLLOW_49); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_SP_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_SP_0, grammarAccess.getLCAccess().getSPTerminalRuleCall_0());
            	      		
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalWhileDsl.g:2178:3: this_CR_1= RULE_CR
            	    {
            	    this_CR_1=(Token)match(input,RULE_CR,FOLLOW_49); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_CR_1);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_CR_1, grammarAccess.getLCAccess().getCRTerminalRuleCall_1());
            	      		
            	    }

            	    }
            	    break;
            	case 3 :
            	    // InternalWhileDsl.g:2186:3: this_TAB_2= RULE_TAB
            	    {
            	    this_TAB_2=(Token)match(input,RULE_TAB,FOLLOW_49); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_TAB_2);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_TAB_2, grammarAccess.getLCAccess().getTABTerminalRuleCall_2());
            	      		
            	    }

            	    }
            	    break;
            	case 4 :
            	    // InternalWhileDsl.g:2194:3: this_LF_3= RULE_LF
            	    {
            	    this_LF_3=(Token)match(input,RULE_LF,FOLLOW_49); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_LF_3);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_LF_3, grammarAccess.getLCAccess().getLFTerminalRuleCall_3());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLC"

    // $ANTLR start synpred1_InternalWhileDsl
    public final void synpred1_InternalWhileDsl_fragment() throws RecognitionException {   
        // InternalWhileDsl.g:1783:4: ( ( ( ruleExprAnd ) ) )
        // InternalWhileDsl.g:1783:5: ( ( ruleExprAnd ) )
        {
        // InternalWhileDsl.g:1783:5: ( ( ruleExprAnd ) )
        // InternalWhileDsl.g:1784:5: ( ruleExprAnd )
        {
        // InternalWhileDsl.g:1784:5: ( ruleExprAnd )
        // InternalWhileDsl.g:1785:6: ruleExprAnd
        {
        pushFollow(FOLLOW_2);
        ruleExprAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred1_InternalWhileDsl

    // Delegated rules

    public final boolean synpred1_InternalWhileDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalWhileDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\1\5\6\uffff";
    static final String dfa_3s = "\5\6\2\uffff";
    static final String dfa_4s = "\5\37\2\uffff";
    static final String dfa_5s = "\5\uffff\1\2\1\1";
    static final String dfa_6s = "\7\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\1\4\12\uffff\1\5\2\uffff\1\6\2\uffff\1\5\3\uffff\2\5",
            "\1\1\1\2\1\3\1\4\12\uffff\1\5\2\uffff\1\6\2\uffff\1\5\3\uffff\2\5",
            "\1\1\1\2\1\3\1\4\12\uffff\1\5\2\uffff\1\6\2\uffff\1\5\3\uffff\2\5",
            "\1\1\1\2\1\3\1\4\12\uffff\1\5\2\uffff\1\6\2\uffff\1\5\3\uffff\2\5",
            "\1\1\1\2\1\3\1\4\12\uffff\1\5\2\uffff\1\6\2\uffff\1\5\3\uffff\2\5",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 482:3: ( ruleLC otherlv_2= ';' ruleLC ( (lv_commands_4_0= ruleCommand ) ) )*";
        }
    }
    static final String dfa_8s = "\5\42\2\uffff";
    static final String[] dfa_9s = {
            "\1\1\1\2\1\3\1\4\14\uffff\1\6\13\uffff\1\5",
            "\1\1\1\2\1\3\1\4\14\uffff\1\6\13\uffff\1\5",
            "\1\1\1\2\1\3\1\4\14\uffff\1\6\13\uffff\1\5",
            "\1\1\1\2\1\3\1\4\14\uffff\1\6\13\uffff\1\5",
            "\1\1\1\2\1\3\1\4\14\uffff\1\6\13\uffff\1\5",
            "",
            ""
    };
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final short[][] dfa_9 = unpackEncodedStringArray(dfa_9s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_8;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_9;
        }
        public String getDescription() {
            return "()* loopback of 1199:3: ( ruleLC otherlv_2= ',' ruleLC ( (lv_variables_4_0= RULE_VARIABLE ) ) )*";
        }
    }
    static final String dfa_10s = "\5\4\2\uffff";
    static final String dfa_11s = "\5\55\2\uffff";
    static final String[] dfa_12s = {
            "\2\6\1\1\1\2\1\3\1\4\32\uffff\2\6\2\uffff\1\5\4\uffff\1\6",
            "\2\6\1\1\1\2\1\3\1\4\32\uffff\2\6\2\uffff\1\5\4\uffff\1\6",
            "\2\6\1\1\1\2\1\3\1\4\32\uffff\2\6\2\uffff\1\5\4\uffff\1\6",
            "\2\6\1\1\1\2\1\3\1\4\32\uffff\2\6\2\uffff\1\5\4\uffff\1\6",
            "\2\6\1\1\1\2\1\3\1\4\32\uffff\2\6\2\uffff\1\5\4\uffff\1\6",
            "",
            ""
    };
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()* loopback of 1665:3: ( ruleLC ( (lv_expressions_2_0= ruleExpr ) ) )*";
        }
    }
    static final String[] dfa_13s = {
            "\2\5\1\1\1\2\1\3\1\4\12\uffff\1\5\1\uffff\2\5\1\uffff\2\5\2\uffff\3\5\1\uffff\1\5\2\uffff\2\5\2\uffff\1\5\2\uffff\1\6\1\uffff\1\5",
            "\2\5\1\1\1\2\1\3\1\4\12\uffff\1\5\2\uffff\1\5\1\uffff\2\5\2\uffff\3\5\1\uffff\1\5\2\uffff\2\5\2\uffff\1\5\2\uffff\1\6\1\uffff\1\5",
            "\2\5\1\1\1\2\1\3\1\4\12\uffff\1\5\2\uffff\1\5\1\uffff\2\5\2\uffff\3\5\1\uffff\1\5\2\uffff\2\5\2\uffff\1\5\2\uffff\1\6\1\uffff\1\5",
            "\2\5\1\1\1\2\1\3\1\4\12\uffff\1\5\2\uffff\1\5\1\uffff\2\5\2\uffff\3\5\1\uffff\1\5\2\uffff\2\5\2\uffff\1\5\2\uffff\1\6\1\uffff\1\5",
            "\2\5\1\1\1\2\1\3\1\4\12\uffff\1\5\2\uffff\1\5\1\uffff\2\5\2\uffff\3\5\1\uffff\1\5\2\uffff\2\5\2\uffff\1\5\2\uffff\1\6\1\uffff\1\5",
            "",
            ""
    };
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 1867:3: ( ruleLC otherlv_2= 'and' ruleLC ( (lv_expressionsOr_4_0= ruleExprOr ) ) )*";
        }
    }
    static final String[] dfa_14s = {
            "\2\5\1\1\1\2\1\3\1\4\12\uffff\1\5\1\uffff\2\5\1\uffff\2\5\2\uffff\3\5\1\uffff\1\5\2\uffff\2\5\2\uffff\1\5\2\uffff\1\5\1\6\1\5",
            "\2\5\1\1\1\2\1\3\1\4\12\uffff\1\5\2\uffff\1\5\1\uffff\2\5\2\uffff\3\5\1\uffff\1\5\2\uffff\2\5\2\uffff\1\5\2\uffff\1\5\1\6\1\5",
            "\2\5\1\1\1\2\1\3\1\4\12\uffff\1\5\2\uffff\1\5\1\uffff\2\5\2\uffff\3\5\1\uffff\1\5\2\uffff\2\5\2\uffff\1\5\2\uffff\1\5\1\6\1\5",
            "\2\5\1\1\1\2\1\3\1\4\12\uffff\1\5\2\uffff\1\5\1\uffff\2\5\2\uffff\3\5\1\uffff\1\5\2\uffff\2\5\2\uffff\1\5\2\uffff\1\5\1\6\1\5",
            "\2\5\1\1\1\2\1\3\1\4\12\uffff\1\5\2\uffff\1\5\1\uffff\2\5\2\uffff\3\5\1\uffff\1\5\2\uffff\2\5\2\uffff\1\5\2\uffff\1\5\1\6\1\5",
            "",
            ""
    };
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 1944:3: ( ruleLC otherlv_2= 'or' ruleLC ( (lv_expressionsNot_4_0= ruleExprNot ) ) )*";
        }
    }
    static final String dfa_15s = "\11\uffff";
    static final String dfa_16s = "\1\4\1\uffff\2\4\1\uffff\4\4";
    static final String dfa_17s = "\1\45\1\uffff\1\55\1\56\1\uffff\4\56";
    static final String dfa_18s = "\1\uffff\1\1\2\uffff\1\2\4\uffff";
    static final String dfa_19s = "\11\uffff}>";
    static final String[] dfa_20s = {
            "\2\1\36\uffff\1\1\1\2",
            "",
            "\1\3\1\4\4\1\32\uffff\2\4\2\1\1\uffff\2\1\2\uffff\1\4",
            "\2\1\1\5\1\6\1\7\1\10\32\uffff\2\1\2\uffff\1\4\4\uffff\1\1\1\4",
            "",
            "\2\1\1\5\1\6\1\7\1\10\32\uffff\2\1\7\uffff\1\1\1\4",
            "\2\1\1\5\1\6\1\7\1\10\32\uffff\2\1\7\uffff\1\1\1\4",
            "\2\1\1\5\1\6\1\7\1\10\32\uffff\2\1\7\uffff\1\1\1\4",
            "\2\1\1\5\1\6\1\7\1\10\32\uffff\2\1\7\uffff\1\1\1\4"
    };

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_15;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "2100:3: ( ( (lv_exprRSimple_4_0= ruleExprSimple ) ) | (otherlv_5= '(' ( (lv_exprRExpr_6_0= ruleExpr ) ) otherlv_7= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000003D0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000403C0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000803C0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000003E0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000001003C0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000009190003E0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000002003C0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000008003C2L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00002030000003F0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000020003C0L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000040003C0L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000200003C0L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000C00003C0L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000000800003C0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000002000003C0L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000004000003C0L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000000004003C2L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000100000003C0L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00002030000003F2L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000800000003C2L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000203000000030L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00001000000003C2L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00004000000003C0L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x00000000000003C2L});

}