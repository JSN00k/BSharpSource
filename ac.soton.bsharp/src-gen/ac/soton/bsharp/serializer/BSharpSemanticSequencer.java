/*
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.serializer;

import ac.soton.bsharp.bSharp.BSClass;
import ac.soton.bsharp.bSharp.BSharpBlock;
import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.BodyElements;
import ac.soton.bsharp.bSharp.Bracket;
import ac.soton.bsharp.bSharp.ClassVarDecl;
import ac.soton.bsharp.bSharp.ConstructedType;
import ac.soton.bsharp.bSharp.Datatype;
import ac.soton.bsharp.bSharp.DatatypeConstructor;
import ac.soton.bsharp.bSharp.Extend;
import ac.soton.bsharp.bSharp.FileImport;
import ac.soton.bsharp.bSharp.FunctionCall;
import ac.soton.bsharp.bSharp.FunctionDecl;
import ac.soton.bsharp.bSharp.GlobalImport;
import ac.soton.bsharp.bSharp.Infix;
import ac.soton.bsharp.bSharp.Instance;
import ac.soton.bsharp.bSharp.LocalImport;
import ac.soton.bsharp.bSharp.MatchCase;
import ac.soton.bsharp.bSharp.MatchStatement;
import ac.soton.bsharp.bSharp.PolyContext;
import ac.soton.bsharp.bSharp.PolyType;
import ac.soton.bsharp.bSharp.Prefix;
import ac.soton.bsharp.bSharp.QuantLambda;
import ac.soton.bsharp.bSharp.SuperTypeList;
import ac.soton.bsharp.bSharp.TheoremBody;
import ac.soton.bsharp.bSharp.TheoremDecl;
import ac.soton.bsharp.bSharp.TopLevel;
import ac.soton.bsharp.bSharp.TopLevelFile;
import ac.soton.bsharp.bSharp.TopLevelImport;
import ac.soton.bsharp.bSharp.TypeConstrBracket;
import ac.soton.bsharp.bSharp.TypeConstructor;
import ac.soton.bsharp.bSharp.TypeDeclContext;
import ac.soton.bsharp.bSharp.TypedVariable;
import ac.soton.bsharp.bSharp.TypedVariableList;
import ac.soton.bsharp.bSharp.VariableTyping;
import ac.soton.bsharp.bSharp.Where;
import ac.soton.bsharp.services.BSharpGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class BSharpSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BSharpGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BSharpPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BSharpPackage.BS_CLASS:
				sequence_Class(context, (BSClass) semanticObject); 
				return; 
			case BSharpPackage.BSHARP_BLOCK:
				sequence_BSharpBlock(context, (BSharpBlock) semanticObject); 
				return; 
			case BSharpPackage.BODY_ELEMENTS:
				sequence_BodyElements(context, (BodyElements) semanticObject); 
				return; 
			case BSharpPackage.BRACKET:
				sequence_Bracket(context, (Bracket) semanticObject); 
				return; 
			case BSharpPackage.CLASS_VAR_DECL:
				sequence_ClassVarDecl(context, (ClassVarDecl) semanticObject); 
				return; 
			case BSharpPackage.CONSTRUCTED_TYPE:
				sequence_ConstructedType(context, (ConstructedType) semanticObject); 
				return; 
			case BSharpPackage.DATATYPE:
				sequence_Datatype(context, (Datatype) semanticObject); 
				return; 
			case BSharpPackage.DATATYPE_CONSTRUCTOR:
				sequence_DatatypeConstructor(context, (DatatypeConstructor) semanticObject); 
				return; 
			case BSharpPackage.EXTEND:
				sequence_Extend(context, (Extend) semanticObject); 
				return; 
			case BSharpPackage.FILE_IMPORT:
				sequence_FileImport(context, (FileImport) semanticObject); 
				return; 
			case BSharpPackage.FUNCTION_CALL:
				sequence_FunctionCall(context, (FunctionCall) semanticObject); 
				return; 
			case BSharpPackage.FUNCTION_DECL:
				sequence_FunctionDecl(context, (FunctionDecl) semanticObject); 
				return; 
			case BSharpPackage.GLOBAL_IMPORT:
				sequence_GlobalImport(context, (GlobalImport) semanticObject); 
				return; 
			case BSharpPackage.INFIX:
				sequence_Infix(context, (Infix) semanticObject); 
				return; 
			case BSharpPackage.INSTANCE:
				sequence_Instance(context, (Instance) semanticObject); 
				return; 
			case BSharpPackage.LOCAL_IMPORT:
				sequence_LocalImport(context, (LocalImport) semanticObject); 
				return; 
			case BSharpPackage.MATCH_CASE:
				sequence_MatchCase(context, (MatchCase) semanticObject); 
				return; 
			case BSharpPackage.MATCH_STATEMENT:
				sequence_MatchStatement(context, (MatchStatement) semanticObject); 
				return; 
			case BSharpPackage.POLY_CONTEXT:
				sequence_PolyContext(context, (PolyContext) semanticObject); 
				return; 
			case BSharpPackage.POLY_TYPE:
				sequence_PolyType(context, (PolyType) semanticObject); 
				return; 
			case BSharpPackage.PREFIX:
				sequence_Prefix(context, (Prefix) semanticObject); 
				return; 
			case BSharpPackage.QUANT_LAMBDA:
				if (rule == grammarAccess.getLambdaRule()) {
					sequence_Lambda(context, (QuantLambda) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getRootExpressionRule()) {
					sequence_Lambda_Quantifier(context, (QuantLambda) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getQuantifierRule()) {
					sequence_Quantifier(context, (QuantLambda) semanticObject); 
					return; 
				}
				else break;
			case BSharpPackage.SUPER_TYPE_LIST:
				sequence_SuperTypeList(context, (SuperTypeList) semanticObject); 
				return; 
			case BSharpPackage.THEOREM_BODY:
				sequence_TheoremBody(context, (TheoremBody) semanticObject); 
				return; 
			case BSharpPackage.THEOREM_DECL:
				sequence_TheoremDecl(context, (TheoremDecl) semanticObject); 
				return; 
			case BSharpPackage.TOP_LEVEL:
				sequence_TopLevel(context, (TopLevel) semanticObject); 
				return; 
			case BSharpPackage.TOP_LEVEL_FILE:
				sequence_TopLevelFile(context, (TopLevelFile) semanticObject); 
				return; 
			case BSharpPackage.TOP_LEVEL_IMPORT:
				sequence_TopLevelImport(context, (TopLevelImport) semanticObject); 
				return; 
			case BSharpPackage.TYPE_CONSTR_BRACKET:
				sequence_TypeConstrBracket(context, (TypeConstrBracket) semanticObject); 
				return; 
			case BSharpPackage.TYPE_CONSTRUCTOR:
				sequence_TypeConstructor(context, (TypeConstructor) semanticObject); 
				return; 
			case BSharpPackage.TYPE_DECL_CONTEXT:
				sequence_TypeDeclContext(context, (TypeDeclContext) semanticObject); 
				return; 
			case BSharpPackage.TYPED_VARIABLE:
				sequence_TypedVariable(context, (TypedVariable) semanticObject); 
				return; 
			case BSharpPackage.TYPED_VARIABLE_LIST:
				sequence_TypedVariableList(context, (TypedVariableList) semanticObject); 
				return; 
			case BSharpPackage.VARIABLE_TYPING:
				sequence_VariableTyping(context, (VariableTyping) semanticObject); 
				return; 
			case BSharpPackage.WHERE:
				sequence_Where(context, (Where) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     BSharpBlock returns BSharpBlock
	 *
	 * Constraint:
	 *     (functions+=FunctionDecl | theorems+=TheoremBody)*
	 */
	protected void sequence_BSharpBlock(ISerializationContext context, BSharpBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BodyElements returns BodyElements
	 *
	 * Constraint:
	 *     (classes+=ClassDecl | extends+=Extend)+
	 */
	protected void sequence_BodyElements(ISerializationContext context, BodyElements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RootExpression returns Bracket
	 *     Infix returns Bracket
	 *     Infix.Infix_1_0 returns Bracket
	 *     Element returns Bracket
	 *     Bracket returns Bracket
	 *
	 * Constraint:
	 *     child=RootExpression
	 */
	protected void sequence_Bracket(ISerializationContext context, Bracket semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BSharpPackage.Literals.BRACKET__CHILD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BSharpPackage.Literals.BRACKET__CHILD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBracketAccess().getChildRootExpressionParserRuleCall_1_0(), semanticObject.getChild());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ClassVarDecl returns ClassVarDecl
	 *
	 * Constraint:
	 *     (ownerType=[GenName|ID] typeInst=[ExpressionVariable|ID])
	 */
	protected void sequence_ClassVarDecl(ISerializationContext context, ClassVarDecl semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BSharpPackage.Literals.CLASS_VAR_DECL__OWNER_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BSharpPackage.Literals.CLASS_VAR_DECL__OWNER_TYPE));
			if (transientValues.isValueTransient(semanticObject, BSharpPackage.Literals.CLASS_VAR_DECL__TYPE_INST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BSharpPackage.Literals.CLASS_VAR_DECL__TYPE_INST));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getClassVarDeclAccess().getOwnerTypeGenNameIDTerminalRuleCall_0_0_1(), semanticObject.eGet(BSharpPackage.Literals.CLASS_VAR_DECL__OWNER_TYPE, false));
		feeder.accept(grammarAccess.getClassVarDeclAccess().getTypeInstExpressionVariableIDTerminalRuleCall_2_0_1(), semanticObject.eGet(BSharpPackage.Literals.CLASS_VAR_DECL__TYPE_INST, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ClassDecl returns BSClass
	 *     Type returns BSClass
	 *     GenName returns BSClass
	 *     Class returns BSClass
	 *     ExpressionVariable returns BSClass
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         context=PolyContext? 
	 *         supertypes=SuperTypeList? 
	 *         varList=TypedVariableList? 
	 *         where=Where? 
	 *         block=BSharpBlock
	 *     )
	 */
	protected void sequence_Class(ISerializationContext context, BSClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypeBuilder returns ConstructedType
	 *     ConstructedType returns ConstructedType
	 *     ConstructedType.ConstructedType_1_0 returns ConstructedType
	 *
	 * Constraint:
	 *     (left=ConstructedType_ConstructedType_1_0 constructor=BuiltinTypeInfixOp right=BuilderElem)
	 */
	protected void sequence_ConstructedType(ISerializationContext context, ConstructedType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BSharpPackage.Literals.CONSTRUCTED_TYPE__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BSharpPackage.Literals.CONSTRUCTED_TYPE__LEFT));
			if (transientValues.isValueTransient(semanticObject, BSharpPackage.Literals.CONSTRUCTED_TYPE__CONSTRUCTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BSharpPackage.Literals.CONSTRUCTED_TYPE__CONSTRUCTOR));
			if (transientValues.isValueTransient(semanticObject, BSharpPackage.Literals.CONSTRUCTED_TYPE__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BSharpPackage.Literals.CONSTRUCTED_TYPE__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConstructedTypeAccess().getConstructedTypeLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getConstructedTypeAccess().getConstructorBuiltinTypeInfixOpParserRuleCall_1_1_0(), semanticObject.getConstructor());
		feeder.accept(grammarAccess.getConstructedTypeAccess().getRightBuilderElemParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DatatypeConstructor returns DatatypeConstructor
	 *
	 * Constraint:
	 *     (name=ID decons=TypedVariableList?)
	 */
	protected void sequence_DatatypeConstructor(ISerializationContext context, DatatypeConstructor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassDecl returns Datatype
	 *     Type returns Datatype
	 *     GenName returns Datatype
	 *     Datatype returns Datatype
	 *     ExpressionVariable returns Datatype
	 *
	 * Constraint:
	 *     (name=ID context=PolyContext? constructors+=DatatypeConstructor+ block=BSharpBlock)
	 */
	protected void sequence_Datatype(ISerializationContext context, Datatype semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Extend returns Extend
	 *
	 * Constraint:
	 *     (extendedClass=[ClassDecl|QualifiedName] name=ID block=BSharpBlock)
	 */
	protected void sequence_Extend(ISerializationContext context, Extend semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BSharpPackage.Literals.EXTEND__EXTENDED_CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BSharpPackage.Literals.EXTEND__EXTENDED_CLASS));
			if (transientValues.isValueTransient(semanticObject, BSharpPackage.Literals.EXTEND__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BSharpPackage.Literals.EXTEND__NAME));
			if (transientValues.isValueTransient(semanticObject, BSharpPackage.Literals.EXTEND__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BSharpPackage.Literals.EXTEND__BLOCK));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExtendAccess().getExtendedClassClassDeclQualifiedNameParserRuleCall_1_0_1(), semanticObject.eGet(BSharpPackage.Literals.EXTEND__EXTENDED_CLASS, false));
		feeder.accept(grammarAccess.getExtendAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getExtendAccess().getBlockBSharpBlockParserRuleCall_5_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FileImport returns FileImport
	 *
	 * Constraint:
	 *     (fileName=ID type=ID?)
	 */
	protected void sequence_FileImport(ISerializationContext context, FileImport semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RootExpression returns FunctionCall
	 *     Infix returns FunctionCall
	 *     Infix.Infix_1_0 returns FunctionCall
	 *     Element returns FunctionCall
	 *     FunctionCall returns FunctionCall
	 *
	 * Constraint:
	 *     ((typeInst=[ExpressionVariable|ID] | classVarDecl=ClassVarDecl) context=TypeDeclContext? arguments+=RootExpression? arguments+=RootExpression*)
	 */
	protected void sequence_FunctionCall(ISerializationContext context, FunctionCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FunctionDecl returns FunctionDecl
	 *     ExpressionVariable returns FunctionDecl
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         context=PolyContext? 
	 *         varList=TypedVariableList? 
	 *         returnType=TypeConstructor 
	 *         infix='INFIX'? 
	 *         precedence=INT? 
	 *         expr=RootExpression
	 *     )
	 */
	protected void sequence_FunctionDecl(ISerializationContext context, FunctionDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GlobalImport returns GlobalImport
	 *
	 * Constraint:
	 *     (project=QualifiedName fileImports+=FileImport+)
	 */
	protected void sequence_GlobalImport(ISerializationContext context, GlobalImport semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RootExpression returns Infix
	 *     Infix returns Infix
	 *     Infix.Infix_1_0 returns Infix
	 *
	 * Constraint:
	 *     (left=Infix_Infix_1_0 (funcName=[FunctionDecl|ID] | opName=InbuiltInfix) right=Element)
	 */
	protected void sequence_Infix(ISerializationContext context, Infix semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instance returns Instance
	 *
	 * Constraint:
	 *     (className=[ClassDecl|QualifiedName] context=TypeDeclContext arguments+=RootExpression? arguments+=RootExpression*)
	 */
	protected void sequence_Instance(ISerializationContext context, Instance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Lambda returns QuantLambda
	 *
	 * Constraint:
	 *     (qType='λ' context=PolyContext? varList=TypedVariableList expr=RootExpression)
	 */
	protected void sequence_Lambda(ISerializationContext context, QuantLambda semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RootExpression returns QuantLambda
	 *
	 * Constraint:
	 *     (
	 *         (qType='λ' context=PolyContext? varList=TypedVariableList expr=RootExpression) | 
	 *         ((qType='∀' | qType='∃') context=PolyContext? varList=TypedVariableList expr=RootExpression)
	 *     )
	 */
	protected void sequence_Lambda_Quantifier(ISerializationContext context, QuantLambda semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LocalImport returns LocalImport
	 *
	 * Constraint:
	 *     fileImports+=FileImport+
	 */
	protected void sequence_LocalImport(ISerializationContext context, LocalImport semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MatchCase returns MatchCase
	 *
	 * Constraint:
	 *     (deconName=[DatatypeConstructor|ID] (variables+=TypedVariable variables+=TypedVariable*)? expr=RootExpression)
	 */
	protected void sequence_MatchCase(ISerializationContext context, MatchCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MatchStatement returns MatchStatement
	 *     RootExpression returns MatchStatement
	 *
	 * Constraint:
	 *     (match=[TypedVariable|ID] inductCase+=MatchCase inductCase+=MatchCase*)
	 */
	protected void sequence_MatchStatement(ISerializationContext context, MatchStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PolyContext returns PolyContext
	 *
	 * Constraint:
	 *     polyTypes+=PolyType+
	 */
	protected void sequence_PolyContext(ISerializationContext context, PolyContext semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GenName returns PolyType
	 *     PolyType returns PolyType
	 *
	 * Constraint:
	 *     (name=ID (superTypes+=[ClassDecl|QualifiedName] superTypes+=[ClassDecl|QualifiedName]*)?)
	 */
	protected void sequence_PolyType(ISerializationContext context, PolyType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RootExpression returns Prefix
	 *     Prefix returns Prefix
	 *     Infix returns Prefix
	 *     Infix.Infix_1_0 returns Prefix
	 *     Element returns Prefix
	 *
	 * Constraint:
	 *     (name=PrefixBuiltIn elem=Element)
	 */
	protected void sequence_Prefix(ISerializationContext context, Prefix semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BSharpPackage.Literals.PREFIX__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BSharpPackage.Literals.PREFIX__NAME));
			if (transientValues.isValueTransient(semanticObject, BSharpPackage.Literals.PREFIX__ELEM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BSharpPackage.Literals.PREFIX__ELEM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrefixAccess().getNamePrefixBuiltInParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPrefixAccess().getElemElementParserRuleCall_1_0(), semanticObject.getElem());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Quantifier returns QuantLambda
	 *
	 * Constraint:
	 *     ((qType='∀' | qType='∃') context=PolyContext? varList=TypedVariableList expr=RootExpression)
	 */
	protected void sequence_Quantifier(ISerializationContext context, QuantLambda semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SuperTypeList returns SuperTypeList
	 *
	 * Constraint:
	 *     (superTypes+=ConstructedType superTypes+=ConstructedType*)
	 */
	protected void sequence_SuperTypeList(ISerializationContext context, SuperTypeList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TheoremBody returns TheoremBody
	 *
	 * Constraint:
	 *     theoremDecl+=TheoremDecl+
	 */
	protected void sequence_TheoremBody(ISerializationContext context, TheoremBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TheoremDecl returns TheoremDecl
	 *
	 * Constraint:
	 *     (name=THM_NAME expr=RootExpression)
	 */
	protected void sequence_TheoremDecl(ISerializationContext context, TheoremDecl semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BSharpPackage.Literals.THEOREM_DECL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BSharpPackage.Literals.THEOREM_DECL__NAME));
			if (transientValues.isValueTransient(semanticObject, BSharpPackage.Literals.THEOREM_DECL__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BSharpPackage.Literals.THEOREM_DECL__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTheoremDeclAccess().getNameTHM_NAMEParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTheoremDeclAccess().getExprRootExpressionParserRuleCall_1_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TopLevelFile returns TopLevelFile
	 *
	 * Constraint:
	 *     (noImportElements=BodyElements? topLevelImports+=TopLevelImport*)
	 */
	protected void sequence_TopLevelFile(ISerializationContext context, TopLevelFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TopLevelImport returns TopLevelImport
	 *
	 * Constraint:
	 *     ((globalImports+=GlobalImport | localImports+=LocalImport)+ bodyElements=BodyElements)
	 */
	protected void sequence_TopLevelImport(ISerializationContext context, TopLevelImport semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TopLevel returns TopLevel
	 *
	 * Constraint:
	 *     (name=QualifiedName topLevelFile=TopLevelFile)
	 */
	protected void sequence_TopLevel(ISerializationContext context, TopLevel semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BSharpPackage.Literals.TOP_LEVEL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BSharpPackage.Literals.TOP_LEVEL__NAME));
			if (transientValues.isValueTransient(semanticObject, BSharpPackage.Literals.TOP_LEVEL__TOP_LEVEL_FILE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BSharpPackage.Literals.TOP_LEVEL__TOP_LEVEL_FILE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTopLevelAccess().getNameQualifiedNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTopLevelAccess().getTopLevelFileTopLevelFileParserRuleCall_2_0(), semanticObject.getTopLevelFile());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TypeBuilder returns TypeConstrBracket
	 *     ConstructedType returns TypeConstrBracket
	 *     ConstructedType.ConstructedType_1_0 returns TypeConstrBracket
	 *     BuilderElem returns TypeConstrBracket
	 *     TypeConstrBracket returns TypeConstrBracket
	 *
	 * Constraint:
	 *     child=ConstructedType
	 */
	protected void sequence_TypeConstrBracket(ISerializationContext context, TypeConstrBracket semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BSharpPackage.Literals.TYPE_CONSTR_BRACKET__CHILD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BSharpPackage.Literals.TYPE_CONSTR_BRACKET__CHILD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypeConstrBracketAccess().getChildConstructedTypeParserRuleCall_1_0(), semanticObject.getChild());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TypeBuilder returns TypeConstructor
	 *     ConstructedType returns TypeConstructor
	 *     ConstructedType.ConstructedType_1_0 returns TypeConstructor
	 *     BuilderElem returns TypeConstructor
	 *     TypeConstructor returns TypeConstructor
	 *
	 * Constraint:
	 *     (typeName=[GenName|QualifiedName] context=TypeDeclContext?)
	 */
	protected void sequence_TypeConstructor(ISerializationContext context, TypeConstructor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypeDeclContext returns TypeDeclContext
	 *
	 * Constraint:
	 *     (typeName+=ConstructedType typeName+=ConstructedType*)
	 */
	protected void sequence_TypeDeclContext(ISerializationContext context, TypeDeclContext semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypedVariableList returns TypedVariableList
	 *
	 * Constraint:
	 *     (variablesOfType+=VariableTyping variablesOfType+=VariableTyping*)
	 */
	protected void sequence_TypedVariableList(ISerializationContext context, TypedVariableList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypedVariable returns TypedVariable
	 *     ExpressionVariable returns TypedVariable
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_TypedVariable(ISerializationContext context, TypedVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BSharpPackage.Literals.NAMED_OBJECT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BSharpPackage.Literals.NAMED_OBJECT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypedVariableAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VariableTyping returns VariableTyping
	 *
	 * Constraint:
	 *     (typeVar+=TypedVariable typeVar+=TypedVariable* type=ConstructedType)
	 */
	protected void sequence_VariableTyping(ISerializationContext context, VariableTyping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Where returns Where
	 *
	 * Constraint:
	 *     (expressions+=RootExpression expressions+=RootExpression*)
	 */
	protected void sequence_Where(ISerializationContext context, Where semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
