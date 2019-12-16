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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VARIABLE", "RULE_SYMBOL", "RULE_SP", "RULE_CR", "RULE_TAB", "RULE_LF", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'while'", "'do'", "'od'", "'for'", "'if'", "'then'", "'else'", "'fi'", "'foreach'", "'in'", "':='", "'nop'", "'nil'", "'('", "'cons'", "'list'", "')'", "'hd'", "'tl'", "'and'", "'or'", "'not'", "'=?'"
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
    public static final int RULE_VARIABLE=4;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SYMBOL=5;
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
    // InternalWhileDsl.g:107:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ruleLC ( (lv_functionName_2_0= ruleValidID ) ) ruleLC otherlv_4= ':' ruleLC ( (lv_functionDefinition_6_0= ruleDefinition ) ) ruleLC ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_functionName_2_0 = null;

        EObject lv_functionDefinition_6_0 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:113:2: ( (otherlv_0= 'function' ruleLC ( (lv_functionName_2_0= ruleValidID ) ) ruleLC otherlv_4= ':' ruleLC ( (lv_functionDefinition_6_0= ruleDefinition ) ) ruleLC ) )
            // InternalWhileDsl.g:114:2: (otherlv_0= 'function' ruleLC ( (lv_functionName_2_0= ruleValidID ) ) ruleLC otherlv_4= ':' ruleLC ( (lv_functionDefinition_6_0= ruleDefinition ) ) ruleLC )
            {
            // InternalWhileDsl.g:114:2: (otherlv_0= 'function' ruleLC ( (lv_functionName_2_0= ruleValidID ) ) ruleLC otherlv_4= ':' ruleLC ( (lv_functionDefinition_6_0= ruleDefinition ) ) ruleLC )
            // InternalWhileDsl.g:115:3: otherlv_0= 'function' ruleLC ( (lv_functionName_2_0= ruleValidID ) ) ruleLC otherlv_4= ':' ruleLC ( (lv_functionDefinition_6_0= ruleDefinition ) ) ruleLC
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFunctionAccess().getLCParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_4);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:126:3: ( (lv_functionName_2_0= ruleValidID ) )
            // InternalWhileDsl.g:127:4: (lv_functionName_2_0= ruleValidID )
            {
            // InternalWhileDsl.g:127:4: (lv_functionName_2_0= ruleValidID )
            // InternalWhileDsl.g:128:5: lv_functionName_2_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionAccess().getFunctionNameValidIDParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_functionName_2_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionRule());
              					}
              					set(
              						current,
              						"functionName",
              						lv_functionName_2_0,
              						"esir.comp.cpp.WhileDsl.ValidID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFunctionAccess().getLCParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_6);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,18,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getColonKeyword_4());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFunctionAccess().getLCParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_7);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:163:3: ( (lv_functionDefinition_6_0= ruleDefinition ) )
            // InternalWhileDsl.g:164:4: (lv_functionDefinition_6_0= ruleDefinition )
            {
            // InternalWhileDsl.g:164:4: (lv_functionDefinition_6_0= ruleDefinition )
            // InternalWhileDsl.g:165:5: lv_functionDefinition_6_0= ruleDefinition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionAccess().getFunctionDefinitionDefinitionParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_8);
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
    // InternalWhileDsl.g:193:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalWhileDsl.g:193:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalWhileDsl.g:194:2: iv_ruleDefinition= ruleDefinition EOF
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
    // InternalWhileDsl.g:200:1: ruleDefinition returns [EObject current=null] : (otherlv_0= 'read' ruleLC ( (lv_intput_2_0= ruleInput ) ) ruleLC otherlv_4= '%' ruleLC ( (lv_body_6_0= ruleCommands ) ) ruleLC otherlv_8= '%' ruleLC otherlv_10= 'write' ruleLC ( (lv_output_12_0= ruleOutput ) ) ) ;
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
            // InternalWhileDsl.g:206:2: ( (otherlv_0= 'read' ruleLC ( (lv_intput_2_0= ruleInput ) ) ruleLC otherlv_4= '%' ruleLC ( (lv_body_6_0= ruleCommands ) ) ruleLC otherlv_8= '%' ruleLC otherlv_10= 'write' ruleLC ( (lv_output_12_0= ruleOutput ) ) ) )
            // InternalWhileDsl.g:207:2: (otherlv_0= 'read' ruleLC ( (lv_intput_2_0= ruleInput ) ) ruleLC otherlv_4= '%' ruleLC ( (lv_body_6_0= ruleCommands ) ) ruleLC otherlv_8= '%' ruleLC otherlv_10= 'write' ruleLC ( (lv_output_12_0= ruleOutput ) ) )
            {
            // InternalWhileDsl.g:207:2: (otherlv_0= 'read' ruleLC ( (lv_intput_2_0= ruleInput ) ) ruleLC otherlv_4= '%' ruleLC ( (lv_body_6_0= ruleCommands ) ) ruleLC otherlv_8= '%' ruleLC otherlv_10= 'write' ruleLC ( (lv_output_12_0= ruleOutput ) ) )
            // InternalWhileDsl.g:208:3: otherlv_0= 'read' ruleLC ( (lv_intput_2_0= ruleInput ) ) ruleLC otherlv_4= '%' ruleLC ( (lv_body_6_0= ruleCommands ) ) ruleLC otherlv_8= '%' ruleLC otherlv_10= 'write' ruleLC ( (lv_output_12_0= ruleOutput ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getReadKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDefinitionAccess().getLCParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_9);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:219:3: ( (lv_intput_2_0= ruleInput ) )
            // InternalWhileDsl.g:220:4: (lv_intput_2_0= ruleInput )
            {
            // InternalWhileDsl.g:220:4: (lv_intput_2_0= ruleInput )
            // InternalWhileDsl.g:221:5: lv_intput_2_0= ruleInput
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionAccess().getIntputInputParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_10);
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
            pushFollow(FOLLOW_11);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,20,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDefinitionAccess().getPercentSignKeyword_4());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDefinitionAccess().getLCParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_12);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:256:3: ( (lv_body_6_0= ruleCommands ) )
            // InternalWhileDsl.g:257:4: (lv_body_6_0= ruleCommands )
            {
            // InternalWhileDsl.g:257:4: (lv_body_6_0= ruleCommands )
            // InternalWhileDsl.g:258:5: lv_body_6_0= ruleCommands
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionAccess().getBodyCommandsParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_10);
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
            pushFollow(FOLLOW_11);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_8=(Token)match(input,20,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getDefinitionAccess().getPercentSignKeyword_8());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDefinitionAccess().getLCParserRuleCall_9());
              		
            }
            pushFollow(FOLLOW_14);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_10=(Token)match(input,21,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getDefinitionAccess().getWriteKeyword_10());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDefinitionAccess().getLCParserRuleCall_11());
              		
            }
            pushFollow(FOLLOW_9);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:304:3: ( (lv_output_12_0= ruleOutput ) )
            // InternalWhileDsl.g:305:4: (lv_output_12_0= ruleOutput )
            {
            // InternalWhileDsl.g:305:4: (lv_output_12_0= ruleOutput )
            // InternalWhileDsl.g:306:5: lv_output_12_0= ruleOutput
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
    // InternalWhileDsl.g:327:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalWhileDsl.g:327:46: (iv_ruleInput= ruleInput EOF )
            // InternalWhileDsl.g:328:2: iv_ruleInput= ruleInput EOF
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
    // InternalWhileDsl.g:334:1: ruleInput returns [EObject current=null] : ( ( (lv_variables_0_0= RULE_VARIABLE ) ) ( ruleLC otherlv_2= ',' ruleLC ( (lv_variables_4_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token lv_variables_0_0=null;
        Token otherlv_2=null;
        Token lv_variables_4_0=null;


        	enterRule();

        try {
            // InternalWhileDsl.g:340:2: ( ( ( (lv_variables_0_0= RULE_VARIABLE ) ) ( ruleLC otherlv_2= ',' ruleLC ( (lv_variables_4_0= RULE_VARIABLE ) ) )* ) )
            // InternalWhileDsl.g:341:2: ( ( (lv_variables_0_0= RULE_VARIABLE ) ) ( ruleLC otherlv_2= ',' ruleLC ( (lv_variables_4_0= RULE_VARIABLE ) ) )* )
            {
            // InternalWhileDsl.g:341:2: ( ( (lv_variables_0_0= RULE_VARIABLE ) ) ( ruleLC otherlv_2= ',' ruleLC ( (lv_variables_4_0= RULE_VARIABLE ) ) )* )
            // InternalWhileDsl.g:342:3: ( (lv_variables_0_0= RULE_VARIABLE ) ) ( ruleLC otherlv_2= ',' ruleLC ( (lv_variables_4_0= RULE_VARIABLE ) ) )*
            {
            // InternalWhileDsl.g:342:3: ( (lv_variables_0_0= RULE_VARIABLE ) )
            // InternalWhileDsl.g:343:4: (lv_variables_0_0= RULE_VARIABLE )
            {
            // InternalWhileDsl.g:343:4: (lv_variables_0_0= RULE_VARIABLE )
            // InternalWhileDsl.g:344:5: lv_variables_0_0= RULE_VARIABLE
            {
            lv_variables_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_15); if (state.failed) return current;
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

            // InternalWhileDsl.g:360:3: ( ruleLC otherlv_2= ',' ruleLC ( (lv_variables_4_0= RULE_VARIABLE ) ) )*
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // InternalWhileDsl.g:361:4: ruleLC otherlv_2= ',' ruleLC ( (lv_variables_4_0= RULE_VARIABLE ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getInputAccess().getLCParserRuleCall_1_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_16);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    otherlv_2=(Token)match(input,22,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getInputAccess().getCommaKeyword_1_1());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getInputAccess().getLCParserRuleCall_1_2());
            	      			
            	    }
            	    pushFollow(FOLLOW_17);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalWhileDsl.g:379:4: ( (lv_variables_4_0= RULE_VARIABLE ) )
            	    // InternalWhileDsl.g:380:5: (lv_variables_4_0= RULE_VARIABLE )
            	    {
            	    // InternalWhileDsl.g:380:5: (lv_variables_4_0= RULE_VARIABLE )
            	    // InternalWhileDsl.g:381:6: lv_variables_4_0= RULE_VARIABLE
            	    {
            	    lv_variables_4_0=(Token)match(input,RULE_VARIABLE,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_variables_4_0, grammarAccess.getInputAccess().getVariablesVARIABLETerminalRuleCall_1_3_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getInputRule());
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
    // InternalWhileDsl.g:402:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalWhileDsl.g:402:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalWhileDsl.g:403:2: iv_ruleOutput= ruleOutput EOF
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
    // InternalWhileDsl.g:409:1: ruleOutput returns [EObject current=null] : ( ( (lv_variables_0_0= RULE_VARIABLE ) ) ( ruleLC otherlv_2= ',' ruleLC ( (lv_variables_4_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token lv_variables_0_0=null;
        Token otherlv_2=null;
        Token lv_variables_4_0=null;


        	enterRule();

        try {
            // InternalWhileDsl.g:415:2: ( ( ( (lv_variables_0_0= RULE_VARIABLE ) ) ( ruleLC otherlv_2= ',' ruleLC ( (lv_variables_4_0= RULE_VARIABLE ) ) )* ) )
            // InternalWhileDsl.g:416:2: ( ( (lv_variables_0_0= RULE_VARIABLE ) ) ( ruleLC otherlv_2= ',' ruleLC ( (lv_variables_4_0= RULE_VARIABLE ) ) )* )
            {
            // InternalWhileDsl.g:416:2: ( ( (lv_variables_0_0= RULE_VARIABLE ) ) ( ruleLC otherlv_2= ',' ruleLC ( (lv_variables_4_0= RULE_VARIABLE ) ) )* )
            // InternalWhileDsl.g:417:3: ( (lv_variables_0_0= RULE_VARIABLE ) ) ( ruleLC otherlv_2= ',' ruleLC ( (lv_variables_4_0= RULE_VARIABLE ) ) )*
            {
            // InternalWhileDsl.g:417:3: ( (lv_variables_0_0= RULE_VARIABLE ) )
            // InternalWhileDsl.g:418:4: (lv_variables_0_0= RULE_VARIABLE )
            {
            // InternalWhileDsl.g:418:4: (lv_variables_0_0= RULE_VARIABLE )
            // InternalWhileDsl.g:419:5: lv_variables_0_0= RULE_VARIABLE
            {
            lv_variables_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_15); if (state.failed) return current;
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

            // InternalWhileDsl.g:435:3: ( ruleLC otherlv_2= ',' ruleLC ( (lv_variables_4_0= RULE_VARIABLE ) ) )*
            loop3:
            do {
                int alt3=2;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // InternalWhileDsl.g:436:4: ruleLC otherlv_2= ',' ruleLC ( (lv_variables_4_0= RULE_VARIABLE ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getOutputAccess().getLCParserRuleCall_1_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_16);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    otherlv_2=(Token)match(input,22,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getOutputAccess().getCommaKeyword_1_1());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getOutputAccess().getLCParserRuleCall_1_2());
            	      			
            	    }
            	    pushFollow(FOLLOW_17);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalWhileDsl.g:454:4: ( (lv_variables_4_0= RULE_VARIABLE ) )
            	    // InternalWhileDsl.g:455:5: (lv_variables_4_0= RULE_VARIABLE )
            	    {
            	    // InternalWhileDsl.g:455:5: (lv_variables_4_0= RULE_VARIABLE )
            	    // InternalWhileDsl.g:456:6: lv_variables_4_0= RULE_VARIABLE
            	    {
            	    lv_variables_4_0=(Token)match(input,RULE_VARIABLE,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_variables_4_0, grammarAccess.getOutputAccess().getVariablesVARIABLETerminalRuleCall_1_3_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getOutputRule());
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
    // InternalWhileDsl.g:477:1: entryRuleCommands returns [EObject current=null] : iv_ruleCommands= ruleCommands EOF ;
    public final EObject entryRuleCommands() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommands = null;


        try {
            // InternalWhileDsl.g:477:49: (iv_ruleCommands= ruleCommands EOF )
            // InternalWhileDsl.g:478:2: iv_ruleCommands= ruleCommands EOF
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
    // InternalWhileDsl.g:484:1: ruleCommands returns [EObject current=null] : ( ( (lv_commands_0_0= ruleCommand ) ) ( ruleLC otherlv_2= ';' ruleLC ( (lv_commands_4_0= ruleCommand ) ) )* ) ;
    public final EObject ruleCommands() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_commands_0_0 = null;

        EObject lv_commands_4_0 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:490:2: ( ( ( (lv_commands_0_0= ruleCommand ) ) ( ruleLC otherlv_2= ';' ruleLC ( (lv_commands_4_0= ruleCommand ) ) )* ) )
            // InternalWhileDsl.g:491:2: ( ( (lv_commands_0_0= ruleCommand ) ) ( ruleLC otherlv_2= ';' ruleLC ( (lv_commands_4_0= ruleCommand ) ) )* )
            {
            // InternalWhileDsl.g:491:2: ( ( (lv_commands_0_0= ruleCommand ) ) ( ruleLC otherlv_2= ';' ruleLC ( (lv_commands_4_0= ruleCommand ) ) )* )
            // InternalWhileDsl.g:492:3: ( (lv_commands_0_0= ruleCommand ) ) ( ruleLC otherlv_2= ';' ruleLC ( (lv_commands_4_0= ruleCommand ) ) )*
            {
            // InternalWhileDsl.g:492:3: ( (lv_commands_0_0= ruleCommand ) )
            // InternalWhileDsl.g:493:4: (lv_commands_0_0= ruleCommand )
            {
            // InternalWhileDsl.g:493:4: (lv_commands_0_0= ruleCommand )
            // InternalWhileDsl.g:494:5: lv_commands_0_0= ruleCommand
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

            // InternalWhileDsl.g:511:3: ( ruleLC otherlv_2= ';' ruleLC ( (lv_commands_4_0= ruleCommand ) ) )*
            loop4:
            do {
                int alt4=2;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // InternalWhileDsl.g:512:4: ruleLC otherlv_2= ';' ruleLC ( (lv_commands_4_0= ruleCommand ) )
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
            	    otherlv_2=(Token)match(input,23,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getCommandsAccess().getSemicolonKeyword_1_1());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getCommandsAccess().getLCParserRuleCall_1_2());
            	      			
            	    }
            	    pushFollow(FOLLOW_12);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalWhileDsl.g:530:4: ( (lv_commands_4_0= ruleCommand ) )
            	    // InternalWhileDsl.g:531:5: (lv_commands_4_0= ruleCommand )
            	    {
            	    // InternalWhileDsl.g:531:5: (lv_commands_4_0= ruleCommand )
            	    // InternalWhileDsl.g:532:6: lv_commands_4_0= ruleCommand
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
    // InternalWhileDsl.g:554:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalWhileDsl.g:554:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalWhileDsl.g:555:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalWhileDsl.g:561:1: ruleCommand returns [EObject current=null] : ( ( () ruleNopCommand ) | this_WhileCommand_2= ruleWhileCommand | this_ForCommand_3= ruleForCommand | this_IfCommand_4= ruleIfCommand | this_ForeachCommand_5= ruleForeachCommand | this_VarsCommand_6= ruleVarsCommand ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_WhileCommand_2 = null;

        EObject this_ForCommand_3 = null;

        EObject this_IfCommand_4 = null;

        EObject this_ForeachCommand_5 = null;

        EObject this_VarsCommand_6 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:567:2: ( ( ( () ruleNopCommand ) | this_WhileCommand_2= ruleWhileCommand | this_ForCommand_3= ruleForCommand | this_IfCommand_4= ruleIfCommand | this_ForeachCommand_5= ruleForeachCommand | this_VarsCommand_6= ruleVarsCommand ) )
            // InternalWhileDsl.g:568:2: ( ( () ruleNopCommand ) | this_WhileCommand_2= ruleWhileCommand | this_ForCommand_3= ruleForCommand | this_IfCommand_4= ruleIfCommand | this_ForeachCommand_5= ruleForeachCommand | this_VarsCommand_6= ruleVarsCommand )
            {
            // InternalWhileDsl.g:568:2: ( ( () ruleNopCommand ) | this_WhileCommand_2= ruleWhileCommand | this_ForCommand_3= ruleForCommand | this_IfCommand_4= ruleIfCommand | this_ForeachCommand_5= ruleForeachCommand | this_VarsCommand_6= ruleVarsCommand )
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
                    // InternalWhileDsl.g:569:3: ( () ruleNopCommand )
                    {
                    // InternalWhileDsl.g:569:3: ( () ruleNopCommand )
                    // InternalWhileDsl.g:570:4: () ruleNopCommand
                    {
                    // InternalWhileDsl.g:570:4: ()
                    // InternalWhileDsl.g:571:5: 
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
                    // InternalWhileDsl.g:586:3: this_WhileCommand_2= ruleWhileCommand
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
                    // InternalWhileDsl.g:595:3: this_ForCommand_3= ruleForCommand
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
                    // InternalWhileDsl.g:604:3: this_IfCommand_4= ruleIfCommand
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
                    // InternalWhileDsl.g:613:3: this_ForeachCommand_5= ruleForeachCommand
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
                    // InternalWhileDsl.g:622:3: this_VarsCommand_6= ruleVarsCommand
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
    // InternalWhileDsl.g:634:1: entryRuleWhileCommand returns [EObject current=null] : iv_ruleWhileCommand= ruleWhileCommand EOF ;
    public final EObject entryRuleWhileCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileCommand = null;


        try {
            // InternalWhileDsl.g:634:53: (iv_ruleWhileCommand= ruleWhileCommand EOF )
            // InternalWhileDsl.g:635:2: iv_ruleWhileCommand= ruleWhileCommand EOF
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
    // InternalWhileDsl.g:641:1: ruleWhileCommand returns [EObject current=null] : (otherlv_0= 'while' ruleLC ( (lv_cond_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_body_6_0= ruleCommands ) ) ruleLC otherlv_8= 'od' ) ;
    public final EObject ruleWhileCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_cond_2_0 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:647:2: ( (otherlv_0= 'while' ruleLC ( (lv_cond_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_body_6_0= ruleCommands ) ) ruleLC otherlv_8= 'od' ) )
            // InternalWhileDsl.g:648:2: (otherlv_0= 'while' ruleLC ( (lv_cond_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_body_6_0= ruleCommands ) ) ruleLC otherlv_8= 'od' )
            {
            // InternalWhileDsl.g:648:2: (otherlv_0= 'while' ruleLC ( (lv_cond_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_body_6_0= ruleCommands ) ) ruleLC otherlv_8= 'od' )
            // InternalWhileDsl.g:649:3: otherlv_0= 'while' ruleLC ( (lv_cond_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_body_6_0= ruleCommands ) ) ruleLC otherlv_8= 'od'
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
            // InternalWhileDsl.g:660:3: ( (lv_cond_2_0= ruleExpr ) )
            // InternalWhileDsl.g:661:4: (lv_cond_2_0= ruleExpr )
            {
            // InternalWhileDsl.g:661:4: (lv_cond_2_0= ruleExpr )
            // InternalWhileDsl.g:662:5: lv_cond_2_0= ruleExpr
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
            otherlv_4=(Token)match(input,25,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWhileCommandAccess().getDoKeyword_4());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getWhileCommandAccess().getLCParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_12);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:697:3: ( (lv_body_6_0= ruleCommands ) )
            // InternalWhileDsl.g:698:4: (lv_body_6_0= ruleCommands )
            {
            // InternalWhileDsl.g:698:4: (lv_body_6_0= ruleCommands )
            // InternalWhileDsl.g:699:5: lv_body_6_0= ruleCommands
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
    // InternalWhileDsl.g:731:1: entryRuleForCommand returns [EObject current=null] : iv_ruleForCommand= ruleForCommand EOF ;
    public final EObject entryRuleForCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForCommand = null;


        try {
            // InternalWhileDsl.g:731:51: (iv_ruleForCommand= ruleForCommand EOF )
            // InternalWhileDsl.g:732:2: iv_ruleForCommand= ruleForCommand EOF
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
    // InternalWhileDsl.g:738:1: ruleForCommand returns [EObject current=null] : (otherlv_0= 'for' ruleLC ( (lv_cond_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_body_6_0= ruleCommands ) ) ruleLC otherlv_8= 'od' ) ;
    public final EObject ruleForCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_cond_2_0 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:744:2: ( (otherlv_0= 'for' ruleLC ( (lv_cond_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_body_6_0= ruleCommands ) ) ruleLC otherlv_8= 'od' ) )
            // InternalWhileDsl.g:745:2: (otherlv_0= 'for' ruleLC ( (lv_cond_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_body_6_0= ruleCommands ) ) ruleLC otherlv_8= 'od' )
            {
            // InternalWhileDsl.g:745:2: (otherlv_0= 'for' ruleLC ( (lv_cond_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_body_6_0= ruleCommands ) ) ruleLC otherlv_8= 'od' )
            // InternalWhileDsl.g:746:3: otherlv_0= 'for' ruleLC ( (lv_cond_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_body_6_0= ruleCommands ) ) ruleLC otherlv_8= 'od'
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
            // InternalWhileDsl.g:757:3: ( (lv_cond_2_0= ruleExpr ) )
            // InternalWhileDsl.g:758:4: (lv_cond_2_0= ruleExpr )
            {
            // InternalWhileDsl.g:758:4: (lv_cond_2_0= ruleExpr )
            // InternalWhileDsl.g:759:5: lv_cond_2_0= ruleExpr
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
            otherlv_4=(Token)match(input,25,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForCommandAccess().getDoKeyword_4());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getForCommandAccess().getLCParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_12);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:794:3: ( (lv_body_6_0= ruleCommands ) )
            // InternalWhileDsl.g:795:4: (lv_body_6_0= ruleCommands )
            {
            // InternalWhileDsl.g:795:4: (lv_body_6_0= ruleCommands )
            // InternalWhileDsl.g:796:5: lv_body_6_0= ruleCommands
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
    // InternalWhileDsl.g:828:1: entryRuleIfCommand returns [EObject current=null] : iv_ruleIfCommand= ruleIfCommand EOF ;
    public final EObject entryRuleIfCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfCommand = null;


        try {
            // InternalWhileDsl.g:828:50: (iv_ruleIfCommand= ruleIfCommand EOF )
            // InternalWhileDsl.g:829:2: iv_ruleIfCommand= ruleIfCommand EOF
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
    // InternalWhileDsl.g:835:1: ruleIfCommand returns [EObject current=null] : (otherlv_0= 'if' ruleLC ( (lv_cond_2_0= ruleExpr ) ) ruleLC otherlv_4= 'then' ruleLC ( (lv_thenBody_6_0= ruleCommands ) ) ruleLC (otherlv_8= 'else' ruleLC ( (lv_elseBody_10_0= ruleCommands ) ) ruleLC )? otherlv_12= 'fi' ) ;
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
            // InternalWhileDsl.g:841:2: ( (otherlv_0= 'if' ruleLC ( (lv_cond_2_0= ruleExpr ) ) ruleLC otherlv_4= 'then' ruleLC ( (lv_thenBody_6_0= ruleCommands ) ) ruleLC (otherlv_8= 'else' ruleLC ( (lv_elseBody_10_0= ruleCommands ) ) ruleLC )? otherlv_12= 'fi' ) )
            // InternalWhileDsl.g:842:2: (otherlv_0= 'if' ruleLC ( (lv_cond_2_0= ruleExpr ) ) ruleLC otherlv_4= 'then' ruleLC ( (lv_thenBody_6_0= ruleCommands ) ) ruleLC (otherlv_8= 'else' ruleLC ( (lv_elseBody_10_0= ruleCommands ) ) ruleLC )? otherlv_12= 'fi' )
            {
            // InternalWhileDsl.g:842:2: (otherlv_0= 'if' ruleLC ( (lv_cond_2_0= ruleExpr ) ) ruleLC otherlv_4= 'then' ruleLC ( (lv_thenBody_6_0= ruleCommands ) ) ruleLC (otherlv_8= 'else' ruleLC ( (lv_elseBody_10_0= ruleCommands ) ) ruleLC )? otherlv_12= 'fi' )
            // InternalWhileDsl.g:843:3: otherlv_0= 'if' ruleLC ( (lv_cond_2_0= ruleExpr ) ) ruleLC otherlv_4= 'then' ruleLC ( (lv_thenBody_6_0= ruleCommands ) ) ruleLC (otherlv_8= 'else' ruleLC ( (lv_elseBody_10_0= ruleCommands ) ) ruleLC )? otherlv_12= 'fi'
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
            // InternalWhileDsl.g:854:3: ( (lv_cond_2_0= ruleExpr ) )
            // InternalWhileDsl.g:855:4: (lv_cond_2_0= ruleExpr )
            {
            // InternalWhileDsl.g:855:4: (lv_cond_2_0= ruleExpr )
            // InternalWhileDsl.g:856:5: lv_cond_2_0= ruleExpr
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
            otherlv_4=(Token)match(input,29,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getIfCommandAccess().getThenKeyword_4());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getIfCommandAccess().getLCParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_12);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:891:3: ( (lv_thenBody_6_0= ruleCommands ) )
            // InternalWhileDsl.g:892:4: (lv_thenBody_6_0= ruleCommands )
            {
            // InternalWhileDsl.g:892:4: (lv_thenBody_6_0= ruleCommands )
            // InternalWhileDsl.g:893:5: lv_thenBody_6_0= ruleCommands
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
            // InternalWhileDsl.g:917:3: (otherlv_8= 'else' ruleLC ( (lv_elseBody_10_0= ruleCommands ) ) ruleLC )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalWhileDsl.g:918:4: otherlv_8= 'else' ruleLC ( (lv_elseBody_10_0= ruleCommands ) ) ruleLC
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getIfCommandAccess().getElseKeyword_8_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getIfCommandAccess().getLCParserRuleCall_8_1());
                      			
                    }
                    pushFollow(FOLLOW_12);
                    ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalWhileDsl.g:929:4: ( (lv_elseBody_10_0= ruleCommands ) )
                    // InternalWhileDsl.g:930:5: (lv_elseBody_10_0= ruleCommands )
                    {
                    // InternalWhileDsl.g:930:5: (lv_elseBody_10_0= ruleCommands )
                    // InternalWhileDsl.g:931:6: lv_elseBody_10_0= ruleCommands
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
    // InternalWhileDsl.g:964:1: entryRuleForeachCommand returns [EObject current=null] : iv_ruleForeachCommand= ruleForeachCommand EOF ;
    public final EObject entryRuleForeachCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeachCommand = null;


        try {
            // InternalWhileDsl.g:964:55: (iv_ruleForeachCommand= ruleForeachCommand EOF )
            // InternalWhileDsl.g:965:2: iv_ruleForeachCommand= ruleForeachCommand EOF
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
    // InternalWhileDsl.g:971:1: ruleForeachCommand returns [EObject current=null] : (otherlv_0= 'foreach' ruleLC ( (lv_expElement_2_0= ruleExpr ) ) ruleLC otherlv_4= 'in' ruleLC ( (lv_expList_6_0= ruleExpr ) ) ruleLC otherlv_8= 'do' ruleLC ( (lv_body_10_0= ruleCommands ) ) ruleLC otherlv_12= 'od' ) ;
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
            // InternalWhileDsl.g:977:2: ( (otherlv_0= 'foreach' ruleLC ( (lv_expElement_2_0= ruleExpr ) ) ruleLC otherlv_4= 'in' ruleLC ( (lv_expList_6_0= ruleExpr ) ) ruleLC otherlv_8= 'do' ruleLC ( (lv_body_10_0= ruleCommands ) ) ruleLC otherlv_12= 'od' ) )
            // InternalWhileDsl.g:978:2: (otherlv_0= 'foreach' ruleLC ( (lv_expElement_2_0= ruleExpr ) ) ruleLC otherlv_4= 'in' ruleLC ( (lv_expList_6_0= ruleExpr ) ) ruleLC otherlv_8= 'do' ruleLC ( (lv_body_10_0= ruleCommands ) ) ruleLC otherlv_12= 'od' )
            {
            // InternalWhileDsl.g:978:2: (otherlv_0= 'foreach' ruleLC ( (lv_expElement_2_0= ruleExpr ) ) ruleLC otherlv_4= 'in' ruleLC ( (lv_expList_6_0= ruleExpr ) ) ruleLC otherlv_8= 'do' ruleLC ( (lv_body_10_0= ruleCommands ) ) ruleLC otherlv_12= 'od' )
            // InternalWhileDsl.g:979:3: otherlv_0= 'foreach' ruleLC ( (lv_expElement_2_0= ruleExpr ) ) ruleLC otherlv_4= 'in' ruleLC ( (lv_expList_6_0= ruleExpr ) ) ruleLC otherlv_8= 'do' ruleLC ( (lv_body_10_0= ruleCommands ) ) ruleLC otherlv_12= 'od'
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
            // InternalWhileDsl.g:990:3: ( (lv_expElement_2_0= ruleExpr ) )
            // InternalWhileDsl.g:991:4: (lv_expElement_2_0= ruleExpr )
            {
            // InternalWhileDsl.g:991:4: (lv_expElement_2_0= ruleExpr )
            // InternalWhileDsl.g:992:5: lv_expElement_2_0= ruleExpr
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
            // InternalWhileDsl.g:1027:3: ( (lv_expList_6_0= ruleExpr ) )
            // InternalWhileDsl.g:1028:4: (lv_expList_6_0= ruleExpr )
            {
            // InternalWhileDsl.g:1028:4: (lv_expList_6_0= ruleExpr )
            // InternalWhileDsl.g:1029:5: lv_expList_6_0= ruleExpr
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
            otherlv_8=(Token)match(input,25,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getForeachCommandAccess().getDoKeyword_8());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getForeachCommandAccess().getLCParserRuleCall_9());
              		
            }
            pushFollow(FOLLOW_12);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:1064:3: ( (lv_body_10_0= ruleCommands ) )
            // InternalWhileDsl.g:1065:4: (lv_body_10_0= ruleCommands )
            {
            // InternalWhileDsl.g:1065:4: (lv_body_10_0= ruleCommands )
            // InternalWhileDsl.g:1066:5: lv_body_10_0= ruleCommands
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
    // InternalWhileDsl.g:1098:1: entryRuleVarsCommand returns [EObject current=null] : iv_ruleVarsCommand= ruleVarsCommand EOF ;
    public final EObject entryRuleVarsCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarsCommand = null;


        try {
            // InternalWhileDsl.g:1098:52: (iv_ruleVarsCommand= ruleVarsCommand EOF )
            // InternalWhileDsl.g:1099:2: iv_ruleVarsCommand= ruleVarsCommand EOF
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
    // InternalWhileDsl.g:1105:1: ruleVarsCommand returns [EObject current=null] : ( ( (lv_variables_0_0= ruleVars ) ) ruleLC otherlv_2= ':=' ruleLC ( (lv_values_4_0= ruleExprs ) ) ) ;
    public final EObject ruleVarsCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_variables_0_0 = null;

        EObject lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:1111:2: ( ( ( (lv_variables_0_0= ruleVars ) ) ruleLC otherlv_2= ':=' ruleLC ( (lv_values_4_0= ruleExprs ) ) ) )
            // InternalWhileDsl.g:1112:2: ( ( (lv_variables_0_0= ruleVars ) ) ruleLC otherlv_2= ':=' ruleLC ( (lv_values_4_0= ruleExprs ) ) )
            {
            // InternalWhileDsl.g:1112:2: ( ( (lv_variables_0_0= ruleVars ) ) ruleLC otherlv_2= ':=' ruleLC ( (lv_values_4_0= ruleExprs ) ) )
            // InternalWhileDsl.g:1113:3: ( (lv_variables_0_0= ruleVars ) ) ruleLC otherlv_2= ':=' ruleLC ( (lv_values_4_0= ruleExprs ) )
            {
            // InternalWhileDsl.g:1113:3: ( (lv_variables_0_0= ruleVars ) )
            // InternalWhileDsl.g:1114:4: (lv_variables_0_0= ruleVars )
            {
            // InternalWhileDsl.g:1114:4: (lv_variables_0_0= ruleVars )
            // InternalWhileDsl.g:1115:5: lv_variables_0_0= ruleVars
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
            // InternalWhileDsl.g:1150:3: ( (lv_values_4_0= ruleExprs ) )
            // InternalWhileDsl.g:1151:4: (lv_values_4_0= ruleExprs )
            {
            // InternalWhileDsl.g:1151:4: (lv_values_4_0= ruleExprs )
            // InternalWhileDsl.g:1152:5: lv_values_4_0= ruleExprs
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
    // InternalWhileDsl.g:1173:1: entryRuleNopCommand returns [String current=null] : iv_ruleNopCommand= ruleNopCommand EOF ;
    public final String entryRuleNopCommand() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNopCommand = null;


        try {
            // InternalWhileDsl.g:1173:50: (iv_ruleNopCommand= ruleNopCommand EOF )
            // InternalWhileDsl.g:1174:2: iv_ruleNopCommand= ruleNopCommand EOF
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
    // InternalWhileDsl.g:1180:1: ruleNopCommand returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'nop' ;
    public final AntlrDatatypeRuleToken ruleNopCommand() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWhileDsl.g:1186:2: (kw= 'nop' )
            // InternalWhileDsl.g:1187:2: kw= 'nop'
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
    // InternalWhileDsl.g:1195:1: entryRuleVars returns [EObject current=null] : iv_ruleVars= ruleVars EOF ;
    public final EObject entryRuleVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVars = null;


        try {
            // InternalWhileDsl.g:1195:45: (iv_ruleVars= ruleVars EOF )
            // InternalWhileDsl.g:1196:2: iv_ruleVars= ruleVars EOF
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
    // InternalWhileDsl.g:1202:1: ruleVars returns [EObject current=null] : ( ( (lv_variables_0_0= RULE_VARIABLE ) ) ( ruleLC otherlv_2= ',' ruleLC ( (lv_variables_4_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleVars() throws RecognitionException {
        EObject current = null;

        Token lv_variables_0_0=null;
        Token otherlv_2=null;
        Token lv_variables_4_0=null;


        	enterRule();

        try {
            // InternalWhileDsl.g:1208:2: ( ( ( (lv_variables_0_0= RULE_VARIABLE ) ) ( ruleLC otherlv_2= ',' ruleLC ( (lv_variables_4_0= RULE_VARIABLE ) ) )* ) )
            // InternalWhileDsl.g:1209:2: ( ( (lv_variables_0_0= RULE_VARIABLE ) ) ( ruleLC otherlv_2= ',' ruleLC ( (lv_variables_4_0= RULE_VARIABLE ) ) )* )
            {
            // InternalWhileDsl.g:1209:2: ( ( (lv_variables_0_0= RULE_VARIABLE ) ) ( ruleLC otherlv_2= ',' ruleLC ( (lv_variables_4_0= RULE_VARIABLE ) ) )* )
            // InternalWhileDsl.g:1210:3: ( (lv_variables_0_0= RULE_VARIABLE ) ) ( ruleLC otherlv_2= ',' ruleLC ( (lv_variables_4_0= RULE_VARIABLE ) ) )*
            {
            // InternalWhileDsl.g:1210:3: ( (lv_variables_0_0= RULE_VARIABLE ) )
            // InternalWhileDsl.g:1211:4: (lv_variables_0_0= RULE_VARIABLE )
            {
            // InternalWhileDsl.g:1211:4: (lv_variables_0_0= RULE_VARIABLE )
            // InternalWhileDsl.g:1212:5: lv_variables_0_0= RULE_VARIABLE
            {
            lv_variables_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_15); if (state.failed) return current;
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

            // InternalWhileDsl.g:1228:3: ( ruleLC otherlv_2= ',' ruleLC ( (lv_variables_4_0= RULE_VARIABLE ) ) )*
            loop7:
            do {
                int alt7=2;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // InternalWhileDsl.g:1229:4: ruleLC otherlv_2= ',' ruleLC ( (lv_variables_4_0= RULE_VARIABLE ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getVarsAccess().getLCParserRuleCall_1_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_16);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    otherlv_2=(Token)match(input,22,FOLLOW_9); if (state.failed) return current;
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
            	    // InternalWhileDsl.g:1247:4: ( (lv_variables_4_0= RULE_VARIABLE ) )
            	    // InternalWhileDsl.g:1248:5: (lv_variables_4_0= RULE_VARIABLE )
            	    {
            	    // InternalWhileDsl.g:1248:5: (lv_variables_4_0= RULE_VARIABLE )
            	    // InternalWhileDsl.g:1249:6: lv_variables_4_0= RULE_VARIABLE
            	    {
            	    lv_variables_4_0=(Token)match(input,RULE_VARIABLE,FOLLOW_15); if (state.failed) return current;
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
    // InternalWhileDsl.g:1270:1: entryRuleExprSimple returns [EObject current=null] : iv_ruleExprSimple= ruleExprSimple EOF ;
    public final EObject entryRuleExprSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprSimple = null;


        try {
            // InternalWhileDsl.g:1270:51: (iv_ruleExprSimple= ruleExprSimple EOF )
            // InternalWhileDsl.g:1271:2: iv_ruleExprSimple= ruleExprSimple EOF
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
    // InternalWhileDsl.g:1277:1: ruleExprSimple returns [EObject current=null] : ( ( (lv_term_0_0= RULE_VARIABLE ) ) | ( (lv_term_1_0= RULE_SYMBOL ) ) | ( (lv_term_2_0= 'nil' ) ) | ( (lv_expression_3_0= ruleExprSimpleWithLExpr ) ) | ( (lv_expression_4_0= ruleExprSimpleWithExpr ) ) | ( (lv_expression_5_0= ruleExprSimpleWithSymbolLExpr ) ) ) ;
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
            // InternalWhileDsl.g:1283:2: ( ( ( (lv_term_0_0= RULE_VARIABLE ) ) | ( (lv_term_1_0= RULE_SYMBOL ) ) | ( (lv_term_2_0= 'nil' ) ) | ( (lv_expression_3_0= ruleExprSimpleWithLExpr ) ) | ( (lv_expression_4_0= ruleExprSimpleWithExpr ) ) | ( (lv_expression_5_0= ruleExprSimpleWithSymbolLExpr ) ) ) )
            // InternalWhileDsl.g:1284:2: ( ( (lv_term_0_0= RULE_VARIABLE ) ) | ( (lv_term_1_0= RULE_SYMBOL ) ) | ( (lv_term_2_0= 'nil' ) ) | ( (lv_expression_3_0= ruleExprSimpleWithLExpr ) ) | ( (lv_expression_4_0= ruleExprSimpleWithExpr ) ) | ( (lv_expression_5_0= ruleExprSimpleWithSymbolLExpr ) ) )
            {
            // InternalWhileDsl.g:1284:2: ( ( (lv_term_0_0= RULE_VARIABLE ) ) | ( (lv_term_1_0= RULE_SYMBOL ) ) | ( (lv_term_2_0= 'nil' ) ) | ( (lv_expression_3_0= ruleExprSimpleWithLExpr ) ) | ( (lv_expression_4_0= ruleExprSimpleWithExpr ) ) | ( (lv_expression_5_0= ruleExprSimpleWithSymbolLExpr ) ) )
            int alt8=6;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalWhileDsl.g:1285:3: ( (lv_term_0_0= RULE_VARIABLE ) )
                    {
                    // InternalWhileDsl.g:1285:3: ( (lv_term_0_0= RULE_VARIABLE ) )
                    // InternalWhileDsl.g:1286:4: (lv_term_0_0= RULE_VARIABLE )
                    {
                    // InternalWhileDsl.g:1286:4: (lv_term_0_0= RULE_VARIABLE )
                    // InternalWhileDsl.g:1287:5: lv_term_0_0= RULE_VARIABLE
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
                    // InternalWhileDsl.g:1304:3: ( (lv_term_1_0= RULE_SYMBOL ) )
                    {
                    // InternalWhileDsl.g:1304:3: ( (lv_term_1_0= RULE_SYMBOL ) )
                    // InternalWhileDsl.g:1305:4: (lv_term_1_0= RULE_SYMBOL )
                    {
                    // InternalWhileDsl.g:1305:4: (lv_term_1_0= RULE_SYMBOL )
                    // InternalWhileDsl.g:1306:5: lv_term_1_0= RULE_SYMBOL
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
                    // InternalWhileDsl.g:1323:3: ( (lv_term_2_0= 'nil' ) )
                    {
                    // InternalWhileDsl.g:1323:3: ( (lv_term_2_0= 'nil' ) )
                    // InternalWhileDsl.g:1324:4: (lv_term_2_0= 'nil' )
                    {
                    // InternalWhileDsl.g:1324:4: (lv_term_2_0= 'nil' )
                    // InternalWhileDsl.g:1325:5: lv_term_2_0= 'nil'
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
                    // InternalWhileDsl.g:1338:3: ( (lv_expression_3_0= ruleExprSimpleWithLExpr ) )
                    {
                    // InternalWhileDsl.g:1338:3: ( (lv_expression_3_0= ruleExprSimpleWithLExpr ) )
                    // InternalWhileDsl.g:1339:4: (lv_expression_3_0= ruleExprSimpleWithLExpr )
                    {
                    // InternalWhileDsl.g:1339:4: (lv_expression_3_0= ruleExprSimpleWithLExpr )
                    // InternalWhileDsl.g:1340:5: lv_expression_3_0= ruleExprSimpleWithLExpr
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
                    // InternalWhileDsl.g:1358:3: ( (lv_expression_4_0= ruleExprSimpleWithExpr ) )
                    {
                    // InternalWhileDsl.g:1358:3: ( (lv_expression_4_0= ruleExprSimpleWithExpr ) )
                    // InternalWhileDsl.g:1359:4: (lv_expression_4_0= ruleExprSimpleWithExpr )
                    {
                    // InternalWhileDsl.g:1359:4: (lv_expression_4_0= ruleExprSimpleWithExpr )
                    // InternalWhileDsl.g:1360:5: lv_expression_4_0= ruleExprSimpleWithExpr
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
                    // InternalWhileDsl.g:1378:3: ( (lv_expression_5_0= ruleExprSimpleWithSymbolLExpr ) )
                    {
                    // InternalWhileDsl.g:1378:3: ( (lv_expression_5_0= ruleExprSimpleWithSymbolLExpr ) )
                    // InternalWhileDsl.g:1379:4: (lv_expression_5_0= ruleExprSimpleWithSymbolLExpr )
                    {
                    // InternalWhileDsl.g:1379:4: (lv_expression_5_0= ruleExprSimpleWithSymbolLExpr )
                    // InternalWhileDsl.g:1380:5: lv_expression_5_0= ruleExprSimpleWithSymbolLExpr
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
    // InternalWhileDsl.g:1401:1: entryRuleExprSimpleWithLExpr returns [EObject current=null] : iv_ruleExprSimpleWithLExpr= ruleExprSimpleWithLExpr EOF ;
    public final EObject entryRuleExprSimpleWithLExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprSimpleWithLExpr = null;


        try {
            // InternalWhileDsl.g:1401:60: (iv_ruleExprSimpleWithLExpr= ruleExprSimpleWithLExpr EOF )
            // InternalWhileDsl.g:1402:2: iv_ruleExprSimpleWithLExpr= ruleExprSimpleWithLExpr EOF
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
    // InternalWhileDsl.g:1408:1: ruleExprSimpleWithLExpr returns [EObject current=null] : (otherlv_0= '(' ruleLC ( ( (lv_operation_2_1= 'cons' | lv_operation_2_2= 'list' ) ) ) ruleLC ( (lv_lexpr_4_0= ruleLExpr ) ) ruleLC otherlv_6= ')' ) ;
    public final EObject ruleExprSimpleWithLExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_operation_2_1=null;
        Token lv_operation_2_2=null;
        Token otherlv_6=null;
        EObject lv_lexpr_4_0 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:1414:2: ( (otherlv_0= '(' ruleLC ( ( (lv_operation_2_1= 'cons' | lv_operation_2_2= 'list' ) ) ) ruleLC ( (lv_lexpr_4_0= ruleLExpr ) ) ruleLC otherlv_6= ')' ) )
            // InternalWhileDsl.g:1415:2: (otherlv_0= '(' ruleLC ( ( (lv_operation_2_1= 'cons' | lv_operation_2_2= 'list' ) ) ) ruleLC ( (lv_lexpr_4_0= ruleLExpr ) ) ruleLC otherlv_6= ')' )
            {
            // InternalWhileDsl.g:1415:2: (otherlv_0= '(' ruleLC ( ( (lv_operation_2_1= 'cons' | lv_operation_2_2= 'list' ) ) ) ruleLC ( (lv_lexpr_4_0= ruleLExpr ) ) ruleLC otherlv_6= ')' )
            // InternalWhileDsl.g:1416:3: otherlv_0= '(' ruleLC ( ( (lv_operation_2_1= 'cons' | lv_operation_2_2= 'list' ) ) ) ruleLC ( (lv_lexpr_4_0= ruleLExpr ) ) ruleLC otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExprSimpleWithLExprAccess().getLeftParenthesisKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExprSimpleWithLExprAccess().getLCParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_36);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:1427:3: ( ( (lv_operation_2_1= 'cons' | lv_operation_2_2= 'list' ) ) )
            // InternalWhileDsl.g:1428:4: ( (lv_operation_2_1= 'cons' | lv_operation_2_2= 'list' ) )
            {
            // InternalWhileDsl.g:1428:4: ( (lv_operation_2_1= 'cons' | lv_operation_2_2= 'list' ) )
            // InternalWhileDsl.g:1429:5: (lv_operation_2_1= 'cons' | lv_operation_2_2= 'list' )
            {
            // InternalWhileDsl.g:1429:5: (lv_operation_2_1= 'cons' | lv_operation_2_2= 'list' )
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
                    // InternalWhileDsl.g:1430:6: lv_operation_2_1= 'cons'
                    {
                    lv_operation_2_1=(Token)match(input,38,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_operation_2_1, grammarAccess.getExprSimpleWithLExprAccess().getOperationConsKeyword_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExprSimpleWithLExprRule());
                      						}
                      						setWithLastConsumed(current, "operation", lv_operation_2_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalWhileDsl.g:1441:6: lv_operation_2_2= 'list'
                    {
                    lv_operation_2_2=(Token)match(input,39,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_operation_2_2, grammarAccess.getExprSimpleWithLExprAccess().getOperationListKeyword_2_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExprSimpleWithLExprRule());
                      						}
                      						setWithLastConsumed(current, "operation", lv_operation_2_2, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExprSimpleWithLExprAccess().getLCParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_20);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:1461:3: ( (lv_lexpr_4_0= ruleLExpr ) )
            // InternalWhileDsl.g:1462:4: (lv_lexpr_4_0= ruleLExpr )
            {
            // InternalWhileDsl.g:1462:4: (lv_lexpr_4_0= ruleLExpr )
            // InternalWhileDsl.g:1463:5: lv_lexpr_4_0= ruleLExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprSimpleWithLExprAccess().getLexprLExprParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_37);
            lv_lexpr_4_0=ruleLExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprSimpleWithLExprRule());
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

              			newCompositeNode(grammarAccess.getExprSimpleWithLExprAccess().getLCParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_38);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_6=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getExprSimpleWithLExprAccess().getRightParenthesisKeyword_6());
              		
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
    // InternalWhileDsl.g:1495:1: entryRuleExprSimpleWithExpr returns [EObject current=null] : iv_ruleExprSimpleWithExpr= ruleExprSimpleWithExpr EOF ;
    public final EObject entryRuleExprSimpleWithExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprSimpleWithExpr = null;


        try {
            // InternalWhileDsl.g:1495:59: (iv_ruleExprSimpleWithExpr= ruleExprSimpleWithExpr EOF )
            // InternalWhileDsl.g:1496:2: iv_ruleExprSimpleWithExpr= ruleExprSimpleWithExpr EOF
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
    // InternalWhileDsl.g:1502:1: ruleExprSimpleWithExpr returns [EObject current=null] : (otherlv_0= '(' ruleLC ( ( (lv_operation_2_1= 'hd' | lv_operation_2_2= 'tl' ) ) ) ruleLC ( (lv_expr_4_0= ruleExpr ) ) ruleLC otherlv_6= ')' ) ;
    public final EObject ruleExprSimpleWithExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_operation_2_1=null;
        Token lv_operation_2_2=null;
        Token otherlv_6=null;
        EObject lv_expr_4_0 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:1508:2: ( (otherlv_0= '(' ruleLC ( ( (lv_operation_2_1= 'hd' | lv_operation_2_2= 'tl' ) ) ) ruleLC ( (lv_expr_4_0= ruleExpr ) ) ruleLC otherlv_6= ')' ) )
            // InternalWhileDsl.g:1509:2: (otherlv_0= '(' ruleLC ( ( (lv_operation_2_1= 'hd' | lv_operation_2_2= 'tl' ) ) ) ruleLC ( (lv_expr_4_0= ruleExpr ) ) ruleLC otherlv_6= ')' )
            {
            // InternalWhileDsl.g:1509:2: (otherlv_0= '(' ruleLC ( ( (lv_operation_2_1= 'hd' | lv_operation_2_2= 'tl' ) ) ) ruleLC ( (lv_expr_4_0= ruleExpr ) ) ruleLC otherlv_6= ')' )
            // InternalWhileDsl.g:1510:3: otherlv_0= '(' ruleLC ( ( (lv_operation_2_1= 'hd' | lv_operation_2_2= 'tl' ) ) ) ruleLC ( (lv_expr_4_0= ruleExpr ) ) ruleLC otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExprSimpleWithExprAccess().getLeftParenthesisKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExprSimpleWithExprAccess().getLCParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_40);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:1521:3: ( ( (lv_operation_2_1= 'hd' | lv_operation_2_2= 'tl' ) ) )
            // InternalWhileDsl.g:1522:4: ( (lv_operation_2_1= 'hd' | lv_operation_2_2= 'tl' ) )
            {
            // InternalWhileDsl.g:1522:4: ( (lv_operation_2_1= 'hd' | lv_operation_2_2= 'tl' ) )
            // InternalWhileDsl.g:1523:5: (lv_operation_2_1= 'hd' | lv_operation_2_2= 'tl' )
            {
            // InternalWhileDsl.g:1523:5: (lv_operation_2_1= 'hd' | lv_operation_2_2= 'tl' )
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
                    // InternalWhileDsl.g:1524:6: lv_operation_2_1= 'hd'
                    {
                    lv_operation_2_1=(Token)match(input,41,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_operation_2_1, grammarAccess.getExprSimpleWithExprAccess().getOperationHdKeyword_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExprSimpleWithExprRule());
                      						}
                      						setWithLastConsumed(current, "operation", lv_operation_2_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalWhileDsl.g:1535:6: lv_operation_2_2= 'tl'
                    {
                    lv_operation_2_2=(Token)match(input,42,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_operation_2_2, grammarAccess.getExprSimpleWithExprAccess().getOperationTlKeyword_2_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExprSimpleWithExprRule());
                      						}
                      						setWithLastConsumed(current, "operation", lv_operation_2_2, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExprSimpleWithExprAccess().getLCParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_20);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:1555:3: ( (lv_expr_4_0= ruleExpr ) )
            // InternalWhileDsl.g:1556:4: (lv_expr_4_0= ruleExpr )
            {
            // InternalWhileDsl.g:1556:4: (lv_expr_4_0= ruleExpr )
            // InternalWhileDsl.g:1557:5: lv_expr_4_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprSimpleWithExprAccess().getExprExprParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_37);
            lv_expr_4_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprSimpleWithExprRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_4_0,
              						"esir.comp.cpp.WhileDsl.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExprSimpleWithExprAccess().getLCParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_38);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_6=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getExprSimpleWithExprAccess().getRightParenthesisKeyword_6());
              		
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
    // InternalWhileDsl.g:1589:1: entryRuleExprSimpleWithSymbolLExpr returns [EObject current=null] : iv_ruleExprSimpleWithSymbolLExpr= ruleExprSimpleWithSymbolLExpr EOF ;
    public final EObject entryRuleExprSimpleWithSymbolLExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprSimpleWithSymbolLExpr = null;


        try {
            // InternalWhileDsl.g:1589:66: (iv_ruleExprSimpleWithSymbolLExpr= ruleExprSimpleWithSymbolLExpr EOF )
            // InternalWhileDsl.g:1590:2: iv_ruleExprSimpleWithSymbolLExpr= ruleExprSimpleWithSymbolLExpr EOF
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
    // InternalWhileDsl.g:1596:1: ruleExprSimpleWithSymbolLExpr returns [EObject current=null] : (otherlv_0= '(' ruleLC ( (lv_symbol_2_0= RULE_SYMBOL ) ) ruleLC ( (lv_lexpr_4_0= ruleLExpr ) ) ruleLC otherlv_6= ')' ) ;
    public final EObject ruleExprSimpleWithSymbolLExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_symbol_2_0=null;
        Token otherlv_6=null;
        EObject lv_lexpr_4_0 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:1602:2: ( (otherlv_0= '(' ruleLC ( (lv_symbol_2_0= RULE_SYMBOL ) ) ruleLC ( (lv_lexpr_4_0= ruleLExpr ) ) ruleLC otherlv_6= ')' ) )
            // InternalWhileDsl.g:1603:2: (otherlv_0= '(' ruleLC ( (lv_symbol_2_0= RULE_SYMBOL ) ) ruleLC ( (lv_lexpr_4_0= ruleLExpr ) ) ruleLC otherlv_6= ')' )
            {
            // InternalWhileDsl.g:1603:2: (otherlv_0= '(' ruleLC ( (lv_symbol_2_0= RULE_SYMBOL ) ) ruleLC ( (lv_lexpr_4_0= ruleLExpr ) ) ruleLC otherlv_6= ')' )
            // InternalWhileDsl.g:1604:3: otherlv_0= '(' ruleLC ( (lv_symbol_2_0= RULE_SYMBOL ) ) ruleLC ( (lv_lexpr_4_0= ruleLExpr ) ) ruleLC otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExprSimpleWithSymbolLExprAccess().getLeftParenthesisKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExprSimpleWithSymbolLExprAccess().getLCParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_42);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:1615:3: ( (lv_symbol_2_0= RULE_SYMBOL ) )
            // InternalWhileDsl.g:1616:4: (lv_symbol_2_0= RULE_SYMBOL )
            {
            // InternalWhileDsl.g:1616:4: (lv_symbol_2_0= RULE_SYMBOL )
            // InternalWhileDsl.g:1617:5: lv_symbol_2_0= RULE_SYMBOL
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
            // InternalWhileDsl.g:1640:3: ( (lv_lexpr_4_0= ruleLExpr ) )
            // InternalWhileDsl.g:1641:4: (lv_lexpr_4_0= ruleLExpr )
            {
            // InternalWhileDsl.g:1641:4: (lv_lexpr_4_0= ruleLExpr )
            // InternalWhileDsl.g:1642:5: lv_lexpr_4_0= ruleLExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprSimpleWithSymbolLExprAccess().getLexprLExprParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_37);
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
            pushFollow(FOLLOW_38);
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
    // InternalWhileDsl.g:1674:1: entryRuleLExpr returns [EObject current=null] : iv_ruleLExpr= ruleLExpr EOF ;
    public final EObject entryRuleLExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLExpr = null;


        try {
            // InternalWhileDsl.g:1674:46: (iv_ruleLExpr= ruleLExpr EOF )
            // InternalWhileDsl.g:1675:2: iv_ruleLExpr= ruleLExpr EOF
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
    // InternalWhileDsl.g:1681:1: ruleLExpr returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleExpr ) ) ( ruleLC ( (lv_expressions_2_0= ruleExpr ) ) )* ) ;
    public final EObject ruleLExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:1687:2: ( ( ( (lv_expressions_0_0= ruleExpr ) ) ( ruleLC ( (lv_expressions_2_0= ruleExpr ) ) )* ) )
            // InternalWhileDsl.g:1688:2: ( ( (lv_expressions_0_0= ruleExpr ) ) ( ruleLC ( (lv_expressions_2_0= ruleExpr ) ) )* )
            {
            // InternalWhileDsl.g:1688:2: ( ( (lv_expressions_0_0= ruleExpr ) ) ( ruleLC ( (lv_expressions_2_0= ruleExpr ) ) )* )
            // InternalWhileDsl.g:1689:3: ( (lv_expressions_0_0= ruleExpr ) ) ( ruleLC ( (lv_expressions_2_0= ruleExpr ) ) )*
            {
            // InternalWhileDsl.g:1689:3: ( (lv_expressions_0_0= ruleExpr ) )
            // InternalWhileDsl.g:1690:4: (lv_expressions_0_0= ruleExpr )
            {
            // InternalWhileDsl.g:1690:4: (lv_expressions_0_0= ruleExpr )
            // InternalWhileDsl.g:1691:5: lv_expressions_0_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLExprAccess().getExpressionsExprParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_43);
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

            // InternalWhileDsl.g:1708:3: ( ruleLC ( (lv_expressions_2_0= ruleExpr ) ) )*
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // InternalWhileDsl.g:1709:4: ruleLC ( (lv_expressions_2_0= ruleExpr ) )
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
            	    // InternalWhileDsl.g:1716:4: ( (lv_expressions_2_0= ruleExpr ) )
            	    // InternalWhileDsl.g:1717:5: (lv_expressions_2_0= ruleExpr )
            	    {
            	    // InternalWhileDsl.g:1717:5: (lv_expressions_2_0= ruleExpr )
            	    // InternalWhileDsl.g:1718:6: lv_expressions_2_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLExprAccess().getExpressionsExprParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_43);
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
    // InternalWhileDsl.g:1740:1: entryRuleExprs returns [EObject current=null] : iv_ruleExprs= ruleExprs EOF ;
    public final EObject entryRuleExprs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprs = null;


        try {
            // InternalWhileDsl.g:1740:46: (iv_ruleExprs= ruleExprs EOF )
            // InternalWhileDsl.g:1741:2: iv_ruleExprs= ruleExprs EOF
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
    // InternalWhileDsl.g:1747:1: ruleExprs returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleExpr ) ) ( ruleLC otherlv_2= ',' ruleLC ( (lv_expressions_4_0= ruleExpr ) ) )* ) ;
    public final EObject ruleExprs() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_4_0 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:1753:2: ( ( ( (lv_expressions_0_0= ruleExpr ) ) ( ruleLC otherlv_2= ',' ruleLC ( (lv_expressions_4_0= ruleExpr ) ) )* ) )
            // InternalWhileDsl.g:1754:2: ( ( (lv_expressions_0_0= ruleExpr ) ) ( ruleLC otherlv_2= ',' ruleLC ( (lv_expressions_4_0= ruleExpr ) ) )* )
            {
            // InternalWhileDsl.g:1754:2: ( ( (lv_expressions_0_0= ruleExpr ) ) ( ruleLC otherlv_2= ',' ruleLC ( (lv_expressions_4_0= ruleExpr ) ) )* )
            // InternalWhileDsl.g:1755:3: ( (lv_expressions_0_0= ruleExpr ) ) ( ruleLC otherlv_2= ',' ruleLC ( (lv_expressions_4_0= ruleExpr ) ) )*
            {
            // InternalWhileDsl.g:1755:3: ( (lv_expressions_0_0= ruleExpr ) )
            // InternalWhileDsl.g:1756:4: (lv_expressions_0_0= ruleExpr )
            {
            // InternalWhileDsl.g:1756:4: (lv_expressions_0_0= ruleExpr )
            // InternalWhileDsl.g:1757:5: lv_expressions_0_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprsAccess().getExpressionsExprParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_15);
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

            // InternalWhileDsl.g:1774:3: ( ruleLC otherlv_2= ',' ruleLC ( (lv_expressions_4_0= ruleExpr ) ) )*
            loop12:
            do {
                int alt12=2;
                alt12 = dfa12.predict(input);
                switch (alt12) {
            	case 1 :
            	    // InternalWhileDsl.g:1775:4: ruleLC otherlv_2= ',' ruleLC ( (lv_expressions_4_0= ruleExpr ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getExprsAccess().getLCParserRuleCall_1_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_16);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    otherlv_2=(Token)match(input,22,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getExprsAccess().getCommaKeyword_1_1());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getExprsAccess().getLCParserRuleCall_1_2());
            	      			
            	    }
            	    pushFollow(FOLLOW_20);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalWhileDsl.g:1793:4: ( (lv_expressions_4_0= ruleExpr ) )
            	    // InternalWhileDsl.g:1794:5: (lv_expressions_4_0= ruleExpr )
            	    {
            	    // InternalWhileDsl.g:1794:5: (lv_expressions_4_0= ruleExpr )
            	    // InternalWhileDsl.g:1795:6: lv_expressions_4_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExprsAccess().getExpressionsExprParserRuleCall_1_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_expressions_4_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExprsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"expressions",
            	      							lv_expressions_4_0,
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
    // InternalWhileDsl.g:1817:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalWhileDsl.g:1817:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalWhileDsl.g:1818:2: iv_ruleExpr= ruleExpr EOF
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
    // InternalWhileDsl.g:1824:1: ruleExpr returns [EObject current=null] : ( ( ( ( ( ruleExprAnd ) ) )=> ( (lv_expression_0_0= ruleExprAnd ) ) ) | ( (lv_expression_1_0= ruleExprSimple ) ) ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;

        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:1830:2: ( ( ( ( ( ( ruleExprAnd ) ) )=> ( (lv_expression_0_0= ruleExprAnd ) ) ) | ( (lv_expression_1_0= ruleExprSimple ) ) ) )
            // InternalWhileDsl.g:1831:2: ( ( ( ( ( ruleExprAnd ) ) )=> ( (lv_expression_0_0= ruleExprAnd ) ) ) | ( (lv_expression_1_0= ruleExprSimple ) ) )
            {
            // InternalWhileDsl.g:1831:2: ( ( ( ( ( ruleExprAnd ) ) )=> ( (lv_expression_0_0= ruleExprAnd ) ) ) | ( (lv_expression_1_0= ruleExprSimple ) ) )
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
                    // InternalWhileDsl.g:1832:3: ( ( ( ( ruleExprAnd ) ) )=> ( (lv_expression_0_0= ruleExprAnd ) ) )
                    {
                    // InternalWhileDsl.g:1832:3: ( ( ( ( ruleExprAnd ) ) )=> ( (lv_expression_0_0= ruleExprAnd ) ) )
                    // InternalWhileDsl.g:1833:4: ( ( ( ruleExprAnd ) ) )=> ( (lv_expression_0_0= ruleExprAnd ) )
                    {
                    // InternalWhileDsl.g:1839:4: ( (lv_expression_0_0= ruleExprAnd ) )
                    // InternalWhileDsl.g:1840:5: (lv_expression_0_0= ruleExprAnd )
                    {
                    // InternalWhileDsl.g:1840:5: (lv_expression_0_0= ruleExprAnd )
                    // InternalWhileDsl.g:1841:6: lv_expression_0_0= ruleExprAnd
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
                    // InternalWhileDsl.g:1860:3: ( (lv_expression_1_0= ruleExprSimple ) )
                    {
                    // InternalWhileDsl.g:1860:3: ( (lv_expression_1_0= ruleExprSimple ) )
                    // InternalWhileDsl.g:1861:4: (lv_expression_1_0= ruleExprSimple )
                    {
                    // InternalWhileDsl.g:1861:4: (lv_expression_1_0= ruleExprSimple )
                    // InternalWhileDsl.g:1862:5: lv_expression_1_0= ruleExprSimple
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
    // InternalWhileDsl.g:1883:1: entryRuleExprAnd returns [EObject current=null] : iv_ruleExprAnd= ruleExprAnd EOF ;
    public final EObject entryRuleExprAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAnd = null;


        try {
            // InternalWhileDsl.g:1883:48: (iv_ruleExprAnd= ruleExprAnd EOF )
            // InternalWhileDsl.g:1884:2: iv_ruleExprAnd= ruleExprAnd EOF
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
    // InternalWhileDsl.g:1890:1: ruleExprAnd returns [EObject current=null] : ( ( (lv_expressionsOr_0_0= ruleExprOr ) ) ( ruleLC otherlv_2= 'and' ruleLC ( (lv_expressionsOr_4_0= ruleExprOr ) ) )* ) ;
    public final EObject ruleExprAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressionsOr_0_0 = null;

        EObject lv_expressionsOr_4_0 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:1896:2: ( ( ( (lv_expressionsOr_0_0= ruleExprOr ) ) ( ruleLC otherlv_2= 'and' ruleLC ( (lv_expressionsOr_4_0= ruleExprOr ) ) )* ) )
            // InternalWhileDsl.g:1897:2: ( ( (lv_expressionsOr_0_0= ruleExprOr ) ) ( ruleLC otherlv_2= 'and' ruleLC ( (lv_expressionsOr_4_0= ruleExprOr ) ) )* )
            {
            // InternalWhileDsl.g:1897:2: ( ( (lv_expressionsOr_0_0= ruleExprOr ) ) ( ruleLC otherlv_2= 'and' ruleLC ( (lv_expressionsOr_4_0= ruleExprOr ) ) )* )
            // InternalWhileDsl.g:1898:3: ( (lv_expressionsOr_0_0= ruleExprOr ) ) ( ruleLC otherlv_2= 'and' ruleLC ( (lv_expressionsOr_4_0= ruleExprOr ) ) )*
            {
            // InternalWhileDsl.g:1898:3: ( (lv_expressionsOr_0_0= ruleExprOr ) )
            // InternalWhileDsl.g:1899:4: (lv_expressionsOr_0_0= ruleExprOr )
            {
            // InternalWhileDsl.g:1899:4: (lv_expressionsOr_0_0= ruleExprOr )
            // InternalWhileDsl.g:1900:5: lv_expressionsOr_0_0= ruleExprOr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprAndAccess().getExpressionsOrExprOrParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_44);
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

            // InternalWhileDsl.g:1917:3: ( ruleLC otherlv_2= 'and' ruleLC ( (lv_expressionsOr_4_0= ruleExprOr ) ) )*
            loop14:
            do {
                int alt14=2;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // InternalWhileDsl.g:1918:4: ruleLC otherlv_2= 'and' ruleLC ( (lv_expressionsOr_4_0= ruleExprOr ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getExprAndAccess().getLCParserRuleCall_1_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_45);
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
            	    pushFollow(FOLLOW_46);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalWhileDsl.g:1936:4: ( (lv_expressionsOr_4_0= ruleExprOr ) )
            	    // InternalWhileDsl.g:1937:5: (lv_expressionsOr_4_0= ruleExprOr )
            	    {
            	    // InternalWhileDsl.g:1937:5: (lv_expressionsOr_4_0= ruleExprOr )
            	    // InternalWhileDsl.g:1938:6: lv_expressionsOr_4_0= ruleExprOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExprAndAccess().getExpressionsOrExprOrParserRuleCall_1_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_44);
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
    // InternalWhileDsl.g:1960:1: entryRuleExprOr returns [EObject current=null] : iv_ruleExprOr= ruleExprOr EOF ;
    public final EObject entryRuleExprOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprOr = null;


        try {
            // InternalWhileDsl.g:1960:47: (iv_ruleExprOr= ruleExprOr EOF )
            // InternalWhileDsl.g:1961:2: iv_ruleExprOr= ruleExprOr EOF
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
    // InternalWhileDsl.g:1967:1: ruleExprOr returns [EObject current=null] : ( ( (lv_expressionsNot_0_0= ruleExprNot ) ) ( ruleLC otherlv_2= 'or' ruleLC ( (lv_expressionsNot_4_0= ruleExprNot ) ) )* ) ;
    public final EObject ruleExprOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressionsNot_0_0 = null;

        EObject lv_expressionsNot_4_0 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:1973:2: ( ( ( (lv_expressionsNot_0_0= ruleExprNot ) ) ( ruleLC otherlv_2= 'or' ruleLC ( (lv_expressionsNot_4_0= ruleExprNot ) ) )* ) )
            // InternalWhileDsl.g:1974:2: ( ( (lv_expressionsNot_0_0= ruleExprNot ) ) ( ruleLC otherlv_2= 'or' ruleLC ( (lv_expressionsNot_4_0= ruleExprNot ) ) )* )
            {
            // InternalWhileDsl.g:1974:2: ( ( (lv_expressionsNot_0_0= ruleExprNot ) ) ( ruleLC otherlv_2= 'or' ruleLC ( (lv_expressionsNot_4_0= ruleExprNot ) ) )* )
            // InternalWhileDsl.g:1975:3: ( (lv_expressionsNot_0_0= ruleExprNot ) ) ( ruleLC otherlv_2= 'or' ruleLC ( (lv_expressionsNot_4_0= ruleExprNot ) ) )*
            {
            // InternalWhileDsl.g:1975:3: ( (lv_expressionsNot_0_0= ruleExprNot ) )
            // InternalWhileDsl.g:1976:4: (lv_expressionsNot_0_0= ruleExprNot )
            {
            // InternalWhileDsl.g:1976:4: (lv_expressionsNot_0_0= ruleExprNot )
            // InternalWhileDsl.g:1977:5: lv_expressionsNot_0_0= ruleExprNot
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprOrAccess().getExpressionsNotExprNotParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_47);
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

            // InternalWhileDsl.g:1994:3: ( ruleLC otherlv_2= 'or' ruleLC ( (lv_expressionsNot_4_0= ruleExprNot ) ) )*
            loop15:
            do {
                int alt15=2;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // InternalWhileDsl.g:1995:4: ruleLC otherlv_2= 'or' ruleLC ( (lv_expressionsNot_4_0= ruleExprNot ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getExprOrAccess().getLCParserRuleCall_1_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_48);
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
            	    pushFollow(FOLLOW_46);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalWhileDsl.g:2013:4: ( (lv_expressionsNot_4_0= ruleExprNot ) )
            	    // InternalWhileDsl.g:2014:5: (lv_expressionsNot_4_0= ruleExprNot )
            	    {
            	    // InternalWhileDsl.g:2014:5: (lv_expressionsNot_4_0= ruleExprNot )
            	    // InternalWhileDsl.g:2015:6: lv_expressionsNot_4_0= ruleExprNot
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExprOrAccess().getExpressionsNotExprNotParserRuleCall_1_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_47);
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
    // InternalWhileDsl.g:2037:1: entryRuleExprNot returns [EObject current=null] : iv_ruleExprNot= ruleExprNot EOF ;
    public final EObject entryRuleExprNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprNot = null;


        try {
            // InternalWhileDsl.g:2037:48: (iv_ruleExprNot= ruleExprNot EOF )
            // InternalWhileDsl.g:2038:2: iv_ruleExprNot= ruleExprNot EOF
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
    // InternalWhileDsl.g:2044:1: ruleExprNot returns [EObject current=null] : ( ( ( (lv_negation_0_0= 'not' ) ) ruleLC )? ( (lv_expressionEq_2_0= ruleExprEq ) ) ) ;
    public final EObject ruleExprNot() throws RecognitionException {
        EObject current = null;

        Token lv_negation_0_0=null;
        EObject lv_expressionEq_2_0 = null;



        	enterRule();

        try {
            // InternalWhileDsl.g:2050:2: ( ( ( ( (lv_negation_0_0= 'not' ) ) ruleLC )? ( (lv_expressionEq_2_0= ruleExprEq ) ) ) )
            // InternalWhileDsl.g:2051:2: ( ( ( (lv_negation_0_0= 'not' ) ) ruleLC )? ( (lv_expressionEq_2_0= ruleExprEq ) ) )
            {
            // InternalWhileDsl.g:2051:2: ( ( ( (lv_negation_0_0= 'not' ) ) ruleLC )? ( (lv_expressionEq_2_0= ruleExprEq ) ) )
            // InternalWhileDsl.g:2052:3: ( ( (lv_negation_0_0= 'not' ) ) ruleLC )? ( (lv_expressionEq_2_0= ruleExprEq ) )
            {
            // InternalWhileDsl.g:2052:3: ( ( (lv_negation_0_0= 'not' ) ) ruleLC )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==45) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalWhileDsl.g:2053:4: ( (lv_negation_0_0= 'not' ) ) ruleLC
                    {
                    // InternalWhileDsl.g:2053:4: ( (lv_negation_0_0= 'not' ) )
                    // InternalWhileDsl.g:2054:5: (lv_negation_0_0= 'not' )
                    {
                    // InternalWhileDsl.g:2054:5: (lv_negation_0_0= 'not' )
                    // InternalWhileDsl.g:2055:6: lv_negation_0_0= 'not'
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
                    pushFollow(FOLLOW_46);
                    ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalWhileDsl.g:2075:3: ( (lv_expressionEq_2_0= ruleExprEq ) )
            // InternalWhileDsl.g:2076:4: (lv_expressionEq_2_0= ruleExprEq )
            {
            // InternalWhileDsl.g:2076:4: (lv_expressionEq_2_0= ruleExprEq )
            // InternalWhileDsl.g:2077:5: lv_expressionEq_2_0= ruleExprEq
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
    // InternalWhileDsl.g:2098:1: entryRuleExprEq returns [EObject current=null] : iv_ruleExprEq= ruleExprEq EOF ;
    public final EObject entryRuleExprEq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprEq = null;


        try {
            // InternalWhileDsl.g:2098:47: (iv_ruleExprEq= ruleExprEq EOF )
            // InternalWhileDsl.g:2099:2: iv_ruleExprEq= ruleExprEq EOF
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
    // InternalWhileDsl.g:2105:1: ruleExprEq returns [EObject current=null] : ( ( (lv_exprL_0_0= ruleExprSimple ) ) ruleLC otherlv_2= '=?' ruleLC ( ( (lv_exprRSimple_4_0= ruleExprSimple ) ) | (otherlv_5= '(' ( (lv_exprRExpr_6_0= ruleExpr ) ) otherlv_7= ')' ) ) ) ;
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
            // InternalWhileDsl.g:2111:2: ( ( ( (lv_exprL_0_0= ruleExprSimple ) ) ruleLC otherlv_2= '=?' ruleLC ( ( (lv_exprRSimple_4_0= ruleExprSimple ) ) | (otherlv_5= '(' ( (lv_exprRExpr_6_0= ruleExpr ) ) otherlv_7= ')' ) ) ) )
            // InternalWhileDsl.g:2112:2: ( ( (lv_exprL_0_0= ruleExprSimple ) ) ruleLC otherlv_2= '=?' ruleLC ( ( (lv_exprRSimple_4_0= ruleExprSimple ) ) | (otherlv_5= '(' ( (lv_exprRExpr_6_0= ruleExpr ) ) otherlv_7= ')' ) ) )
            {
            // InternalWhileDsl.g:2112:2: ( ( (lv_exprL_0_0= ruleExprSimple ) ) ruleLC otherlv_2= '=?' ruleLC ( ( (lv_exprRSimple_4_0= ruleExprSimple ) ) | (otherlv_5= '(' ( (lv_exprRExpr_6_0= ruleExpr ) ) otherlv_7= ')' ) ) )
            // InternalWhileDsl.g:2113:3: ( (lv_exprL_0_0= ruleExprSimple ) ) ruleLC otherlv_2= '=?' ruleLC ( ( (lv_exprRSimple_4_0= ruleExprSimple ) ) | (otherlv_5= '(' ( (lv_exprRExpr_6_0= ruleExpr ) ) otherlv_7= ')' ) )
            {
            // InternalWhileDsl.g:2113:3: ( (lv_exprL_0_0= ruleExprSimple ) )
            // InternalWhileDsl.g:2114:4: (lv_exprL_0_0= ruleExprSimple )
            {
            // InternalWhileDsl.g:2114:4: (lv_exprL_0_0= ruleExprSimple )
            // InternalWhileDsl.g:2115:5: lv_exprL_0_0= ruleExprSimple
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprEqAccess().getExprLExprSimpleParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_49);
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
            pushFollow(FOLLOW_50);
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
            pushFollow(FOLLOW_46);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalWhileDsl.g:2150:3: ( ( (lv_exprRSimple_4_0= ruleExprSimple ) ) | (otherlv_5= '(' ( (lv_exprRExpr_6_0= ruleExpr ) ) otherlv_7= ')' ) )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalWhileDsl.g:2151:4: ( (lv_exprRSimple_4_0= ruleExprSimple ) )
                    {
                    // InternalWhileDsl.g:2151:4: ( (lv_exprRSimple_4_0= ruleExprSimple ) )
                    // InternalWhileDsl.g:2152:5: (lv_exprRSimple_4_0= ruleExprSimple )
                    {
                    // InternalWhileDsl.g:2152:5: (lv_exprRSimple_4_0= ruleExprSimple )
                    // InternalWhileDsl.g:2153:6: lv_exprRSimple_4_0= ruleExprSimple
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
                    // InternalWhileDsl.g:2171:4: (otherlv_5= '(' ( (lv_exprRExpr_6_0= ruleExpr ) ) otherlv_7= ')' )
                    {
                    // InternalWhileDsl.g:2171:4: (otherlv_5= '(' ( (lv_exprRExpr_6_0= ruleExpr ) ) otherlv_7= ')' )
                    // InternalWhileDsl.g:2172:5: otherlv_5= '(' ( (lv_exprRExpr_6_0= ruleExpr ) ) otherlv_7= ')'
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getExprEqAccess().getLeftParenthesisKeyword_4_1_0());
                      				
                    }
                    // InternalWhileDsl.g:2176:5: ( (lv_exprRExpr_6_0= ruleExpr ) )
                    // InternalWhileDsl.g:2177:6: (lv_exprRExpr_6_0= ruleExpr )
                    {
                    // InternalWhileDsl.g:2177:6: (lv_exprRExpr_6_0= ruleExpr )
                    // InternalWhileDsl.g:2178:7: lv_exprRExpr_6_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getExprEqAccess().getExprRExprExprParserRuleCall_4_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_38);
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
    // InternalWhileDsl.g:2205:1: entryRuleLC returns [String current=null] : iv_ruleLC= ruleLC EOF ;
    public final String entryRuleLC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLC = null;


        try {
            // InternalWhileDsl.g:2205:42: (iv_ruleLC= ruleLC EOF )
            // InternalWhileDsl.g:2206:2: iv_ruleLC= ruleLC EOF
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
    // InternalWhileDsl.g:2212:1: ruleLC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SP_0= RULE_SP | this_CR_1= RULE_CR | this_TAB_2= RULE_TAB | this_LF_3= RULE_LF )* ;
    public final AntlrDatatypeRuleToken ruleLC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SP_0=null;
        Token this_CR_1=null;
        Token this_TAB_2=null;
        Token this_LF_3=null;


        	enterRule();

        try {
            // InternalWhileDsl.g:2218:2: ( (this_SP_0= RULE_SP | this_CR_1= RULE_CR | this_TAB_2= RULE_TAB | this_LF_3= RULE_LF )* )
            // InternalWhileDsl.g:2219:2: (this_SP_0= RULE_SP | this_CR_1= RULE_CR | this_TAB_2= RULE_TAB | this_LF_3= RULE_LF )*
            {
            // InternalWhileDsl.g:2219:2: (this_SP_0= RULE_SP | this_CR_1= RULE_CR | this_TAB_2= RULE_TAB | this_LF_3= RULE_LF )*
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
            	    // InternalWhileDsl.g:2220:3: this_SP_0= RULE_SP
            	    {
            	    this_SP_0=(Token)match(input,RULE_SP,FOLLOW_51); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_SP_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_SP_0, grammarAccess.getLCAccess().getSPTerminalRuleCall_0());
            	      		
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalWhileDsl.g:2228:3: this_CR_1= RULE_CR
            	    {
            	    this_CR_1=(Token)match(input,RULE_CR,FOLLOW_51); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_CR_1);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_CR_1, grammarAccess.getLCAccess().getCRTerminalRuleCall_1());
            	      		
            	    }

            	    }
            	    break;
            	case 3 :
            	    // InternalWhileDsl.g:2236:3: this_TAB_2= RULE_TAB
            	    {
            	    this_TAB_2=(Token)match(input,RULE_TAB,FOLLOW_51); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_TAB_2);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_TAB_2, grammarAccess.getLCAccess().getTABTerminalRuleCall_2());
            	      		
            	    }

            	    }
            	    break;
            	case 4 :
            	    // InternalWhileDsl.g:2244:3: this_LF_3= RULE_LF
            	    {
            	    this_LF_3=(Token)match(input,RULE_LF,FOLLOW_51); if (state.failed) return current;
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


    // $ANTLR start "entryRuleValidID"
    // InternalWhileDsl.g:2255:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // InternalWhileDsl.g:2255:47: (iv_ruleValidID= ruleValidID EOF )
            // InternalWhileDsl.g:2256:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalWhileDsl.g:2262:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_SYMBOL_1= RULE_SYMBOL ) ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_SYMBOL_1=null;


        	enterRule();

        try {
            // InternalWhileDsl.g:2268:2: ( (this_ID_0= RULE_ID | this_SYMBOL_1= RULE_SYMBOL ) )
            // InternalWhileDsl.g:2269:2: (this_ID_0= RULE_ID | this_SYMBOL_1= RULE_SYMBOL )
            {
            // InternalWhileDsl.g:2269:2: (this_ID_0= RULE_ID | this_SYMBOL_1= RULE_SYMBOL )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_SYMBOL) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalWhileDsl.g:2270:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalWhileDsl.g:2278:3: this_SYMBOL_1= RULE_SYMBOL
                    {
                    this_SYMBOL_1=(Token)match(input,RULE_SYMBOL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_SYMBOL_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_SYMBOL_1, grammarAccess.getValidIDAccess().getSYMBOLTerminalRuleCall_1());
                      		
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
    // $ANTLR end "ruleValidID"

    // $ANTLR start synpred1_InternalWhileDsl
    public final void synpred1_InternalWhileDsl_fragment() throws RecognitionException {   
        // InternalWhileDsl.g:1833:4: ( ( ( ruleExprAnd ) ) )
        // InternalWhileDsl.g:1833:5: ( ( ruleExprAnd ) )
        {
        // InternalWhileDsl.g:1833:5: ( ( ruleExprAnd ) )
        // InternalWhileDsl.g:1834:5: ( ruleExprAnd )
        {
        // InternalWhileDsl.g:1834:5: ( ruleExprAnd )
        // InternalWhileDsl.g:1835:6: ruleExprAnd
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


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\1\5\6\uffff";
    static final String dfa_3s = "\5\6\2\uffff";
    static final String dfa_4s = "\5\26\2\uffff";
    static final String dfa_5s = "\5\uffff\1\2\1\1";
    static final String dfa_6s = "\7\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\1\4\12\uffff\1\5\1\uffff\1\6",
            "\1\1\1\2\1\3\1\4\12\uffff\1\5\1\uffff\1\6",
            "\1\1\1\2\1\3\1\4\12\uffff\1\5\1\uffff\1\6",
            "\1\1\1\2\1\3\1\4\12\uffff\1\5\1\uffff\1\6",
            "\1\1\1\2\1\3\1\4\12\uffff\1\5\1\uffff\1\6",
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

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 360:3: ( ruleLC otherlv_2= ',' ruleLC ( (lv_variables_4_0= RULE_VARIABLE ) ) )*";
        }
    }
    static final String dfa_8s = "\5\5\2\uffff";
    static final String[] dfa_9s = {
            "\1\1\1\2\1\3\1\4\7\uffff\1\5\4\uffff\1\6",
            "\1\1\1\2\1\3\1\4\7\uffff\1\5\4\uffff\1\6",
            "\1\1\1\2\1\3\1\4\7\uffff\1\5\4\uffff\1\6",
            "\1\1\1\2\1\3\1\4\7\uffff\1\5\4\uffff\1\6",
            "\1\1\1\2\1\3\1\4\7\uffff\1\5\4\uffff\1\6",
            "",
            ""
    };
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[][] dfa_9 = unpackEncodedStringArray(dfa_9s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_8;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_9;
        }
        public String getDescription() {
            return "()* loopback of 435:3: ( ruleLC otherlv_2= ',' ruleLC ( (lv_variables_4_0= RULE_VARIABLE ) ) )*";
        }
    }
    static final String dfa_10s = "\5\37\2\uffff";
    static final String[] dfa_11s = {
            "\1\1\1\2\1\3\1\4\12\uffff\1\5\2\uffff\1\6\2\uffff\1\5\3\uffff\2\5",
            "\1\1\1\2\1\3\1\4\12\uffff\1\5\2\uffff\1\6\2\uffff\1\5\3\uffff\2\5",
            "\1\1\1\2\1\3\1\4\12\uffff\1\5\2\uffff\1\6\2\uffff\1\5\3\uffff\2\5",
            "\1\1\1\2\1\3\1\4\12\uffff\1\5\2\uffff\1\6\2\uffff\1\5\3\uffff\2\5",
            "\1\1\1\2\1\3\1\4\12\uffff\1\5\2\uffff\1\6\2\uffff\1\5\3\uffff\2\5",
            "",
            ""
    };
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[][] dfa_11 = unpackEncodedStringArray(dfa_11s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_10;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_11;
        }
        public String getDescription() {
            return "()* loopback of 511:3: ( ruleLC otherlv_2= ';' ruleLC ( (lv_commands_4_0= ruleCommand ) ) )*";
        }
    }
    static final String dfa_12s = "\5\42\2\uffff";
    static final String[] dfa_13s = {
            "\1\1\1\2\1\3\1\4\14\uffff\1\6\13\uffff\1\5",
            "\1\1\1\2\1\3\1\4\14\uffff\1\6\13\uffff\1\5",
            "\1\1\1\2\1\3\1\4\14\uffff\1\6\13\uffff\1\5",
            "\1\1\1\2\1\3\1\4\14\uffff\1\6\13\uffff\1\5",
            "\1\1\1\2\1\3\1\4\14\uffff\1\6\13\uffff\1\5",
            "",
            ""
    };
    static final char[] dfa_12 = DFA.unpackEncodedStringToUnsignedChars(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_12;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 1228:3: ( ruleLC otherlv_2= ',' ruleLC ( (lv_variables_4_0= RULE_VARIABLE ) ) )*";
        }
    }
    static final String dfa_14s = "\14\uffff";
    static final String dfa_15s = "\1\4\3\uffff\5\5\3\uffff";
    static final String dfa_16s = "\1\45\3\uffff\5\52\3\uffff";
    static final String dfa_17s = "\1\uffff\1\1\1\2\1\3\5\uffff\1\4\1\6\1\5";
    static final String dfa_18s = "\14\uffff}>";
    static final String[] dfa_19s = {
            "\1\1\1\2\36\uffff\1\3\1\4",
            "",
            "",
            "",
            "\1\12\1\5\1\6\1\7\1\10\34\uffff\2\11\1\uffff\2\13",
            "\1\12\1\5\1\6\1\7\1\10\34\uffff\2\11\1\uffff\2\13",
            "\1\12\1\5\1\6\1\7\1\10\34\uffff\2\11\1\uffff\2\13",
            "\1\12\1\5\1\6\1\7\1\10\34\uffff\2\11\1\uffff\2\13",
            "\1\12\1\5\1\6\1\7\1\10\34\uffff\2\11\1\uffff\2\13",
            "",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "1284:2: ( ( (lv_term_0_0= RULE_VARIABLE ) ) | ( (lv_term_1_0= RULE_SYMBOL ) ) | ( (lv_term_2_0= 'nil' ) ) | ( (lv_expression_3_0= ruleExprSimpleWithLExpr ) ) | ( (lv_expression_4_0= ruleExprSimpleWithExpr ) ) | ( (lv_expression_5_0= ruleExprSimpleWithSymbolLExpr ) ) )";
        }
    }
    static final String dfa_20s = "\5\4\2\uffff";
    static final String dfa_21s = "\5\55\2\uffff";
    static final String[] dfa_22s = {
            "\2\6\1\1\1\2\1\3\1\4\32\uffff\2\6\2\uffff\1\5\4\uffff\1\6",
            "\2\6\1\1\1\2\1\3\1\4\32\uffff\2\6\2\uffff\1\5\4\uffff\1\6",
            "\2\6\1\1\1\2\1\3\1\4\32\uffff\2\6\2\uffff\1\5\4\uffff\1\6",
            "\2\6\1\1\1\2\1\3\1\4\32\uffff\2\6\2\uffff\1\5\4\uffff\1\6",
            "\2\6\1\1\1\2\1\3\1\4\32\uffff\2\6\2\uffff\1\5\4\uffff\1\6",
            "",
            ""
    };
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[][] dfa_22 = unpackEncodedStringArray(dfa_22s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_22;
        }
        public String getDescription() {
            return "()* loopback of 1708:3: ( ruleLC ( (lv_expressions_2_0= ruleExpr ) ) )*";
        }
    }
    static final String[] dfa_23s = {
            "\1\1\1\2\1\3\1\4\12\uffff\1\5\1\uffff\1\6\1\5\2\uffff\1\5\3\uffff\2\5",
            "\1\1\1\2\1\3\1\4\12\uffff\1\5\1\uffff\1\6\1\5\2\uffff\1\5\3\uffff\2\5",
            "\1\1\1\2\1\3\1\4\12\uffff\1\5\1\uffff\1\6\1\5\2\uffff\1\5\3\uffff\2\5",
            "\1\1\1\2\1\3\1\4\12\uffff\1\5\1\uffff\1\6\1\5\2\uffff\1\5\3\uffff\2\5",
            "\1\1\1\2\1\3\1\4\12\uffff\1\5\1\uffff\1\6\1\5\2\uffff\1\5\3\uffff\2\5",
            "",
            ""
    };
    static final short[][] dfa_23 = unpackEncodedStringArray(dfa_23s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_10;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_23;
        }
        public String getDescription() {
            return "()* loopback of 1774:3: ( ruleLC otherlv_2= ',' ruleLC ( (lv_expressions_4_0= ruleExpr ) ) )*";
        }
    }
    static final String[] dfa_24s = {
            "\2\5\1\1\1\2\1\3\1\4\12\uffff\1\5\1\uffff\2\5\1\uffff\2\5\2\uffff\3\5\1\uffff\1\5\2\uffff\2\5\2\uffff\1\5\2\uffff\1\6\1\uffff\1\5",
            "\2\5\1\1\1\2\1\3\1\4\12\uffff\1\5\1\uffff\2\5\1\uffff\2\5\2\uffff\3\5\1\uffff\1\5\2\uffff\2\5\2\uffff\1\5\2\uffff\1\6\1\uffff\1\5",
            "\2\5\1\1\1\2\1\3\1\4\12\uffff\1\5\1\uffff\2\5\1\uffff\2\5\2\uffff\3\5\1\uffff\1\5\2\uffff\2\5\2\uffff\1\5\2\uffff\1\6\1\uffff\1\5",
            "\2\5\1\1\1\2\1\3\1\4\12\uffff\1\5\1\uffff\2\5\1\uffff\2\5\2\uffff\3\5\1\uffff\1\5\2\uffff\2\5\2\uffff\1\5\2\uffff\1\6\1\uffff\1\5",
            "\2\5\1\1\1\2\1\3\1\4\12\uffff\1\5\1\uffff\2\5\1\uffff\2\5\2\uffff\3\5\1\uffff\1\5\2\uffff\2\5\2\uffff\1\5\2\uffff\1\6\1\uffff\1\5",
            "",
            ""
    };
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "()* loopback of 1917:3: ( ruleLC otherlv_2= 'and' ruleLC ( (lv_expressionsOr_4_0= ruleExprOr ) ) )*";
        }
    }
    static final String[] dfa_25s = {
            "\2\5\1\1\1\2\1\3\1\4\12\uffff\1\5\1\uffff\2\5\1\uffff\2\5\2\uffff\3\5\1\uffff\1\5\2\uffff\2\5\2\uffff\1\5\2\uffff\1\5\1\6\1\5",
            "\2\5\1\1\1\2\1\3\1\4\12\uffff\1\5\1\uffff\2\5\1\uffff\2\5\2\uffff\3\5\1\uffff\1\5\2\uffff\2\5\2\uffff\1\5\2\uffff\1\5\1\6\1\5",
            "\2\5\1\1\1\2\1\3\1\4\12\uffff\1\5\1\uffff\2\5\1\uffff\2\5\2\uffff\3\5\1\uffff\1\5\2\uffff\2\5\2\uffff\1\5\2\uffff\1\5\1\6\1\5",
            "\2\5\1\1\1\2\1\3\1\4\12\uffff\1\5\1\uffff\2\5\1\uffff\2\5\2\uffff\3\5\1\uffff\1\5\2\uffff\2\5\2\uffff\1\5\2\uffff\1\5\1\6\1\5",
            "\2\5\1\1\1\2\1\3\1\4\12\uffff\1\5\1\uffff\2\5\1\uffff\2\5\2\uffff\3\5\1\uffff\1\5\2\uffff\2\5\2\uffff\1\5\2\uffff\1\5\1\6\1\5",
            "",
            ""
    };
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "()* loopback of 1994:3: ( ruleLC otherlv_2= 'or' ruleLC ( (lv_expressionsNot_4_0= ruleExprNot ) ) )*";
        }
    }
    static final String dfa_26s = "\11\uffff";
    static final String dfa_27s = "\1\4\1\uffff\2\4\1\uffff\4\4";
    static final String dfa_28s = "\1\45\1\uffff\1\55\1\56\1\uffff\4\56";
    static final String dfa_29s = "\1\uffff\1\1\2\uffff\1\2\4\uffff";
    static final String dfa_30s = "\11\uffff}>";
    static final String[] dfa_31s = {
            "\2\1\36\uffff\1\1\1\2",
            "",
            "\1\4\1\3\4\1\32\uffff\2\4\2\1\1\uffff\2\1\2\uffff\1\4",
            "\2\1\1\5\1\6\1\7\1\10\32\uffff\2\1\2\uffff\1\4\4\uffff\1\1\1\4",
            "",
            "\2\1\1\5\1\6\1\7\1\10\32\uffff\2\1\7\uffff\1\1\1\4",
            "\2\1\1\5\1\6\1\7\1\10\32\uffff\2\1\7\uffff\1\1\1\4",
            "\2\1\1\5\1\6\1\7\1\10\32\uffff\2\1\7\uffff\1\1\1\4",
            "\2\1\1\5\1\6\1\7\1\10\32\uffff\2\1\7\uffff\1\1\1\4"
    };

    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[][] dfa_31 = unpackEncodedStringArray(dfa_31s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_26;
            this.eof = dfa_26;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_29;
            this.special = dfa_30;
            this.transition = dfa_31;
        }
        public String getDescription() {
            return "2150:3: ( ( (lv_exprRSimple_4_0= ruleExprSimple ) ) | (otherlv_5= '(' ( (lv_exprRExpr_6_0= ruleExpr ) ) otherlv_7= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000007E0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000403C0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000803C0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000003D0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001003C0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000009190003D0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000002003C0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000004003C2L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
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
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000C0000003C0L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000100000003C0L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00000600000003C0L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00000000000003E0L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00002030000003F2L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00000800000003C2L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000203000000030L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00001000000003C2L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x00004000000003C0L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x00000000000003C2L});

}