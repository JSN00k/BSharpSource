/*
 * generated by Xtext 2.13.0
 */
package org.xtext.sampleProj.mydsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.sampleProj.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.sampleProj.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Inject
	private MyDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTHM_NAMEAccess().getAlternatives_0(), "rule__THM_NAME__Alternatives_0");
					put(grammarAccess.getTopLevelAccess().getAlternatives(), "rule__TopLevel__Alternatives");
					put(grammarAccess.getClassDeclAccess().getAlternatives(), "rule__ClassDecl__Alternatives");
					put(grammarAccess.getGenNameAccess().getAlternatives(), "rule__GenName__Alternatives");
					put(grammarAccess.getConstructedTypeAccess().getAlternatives_1_0(), "rule__ConstructedType__Alternatives_1_0");
					put(grammarAccess.getTypeConstructorAccess().getAlternatives_0(), "rule__TypeConstructor__Alternatives_0");
					put(grammarAccess.getDatatypeConstructorAccess().getAlternatives_1(), "rule__DatatypeConstructor__Alternatives_1");
					put(grammarAccess.getTypeBodyElementsAccess().getAlternatives(), "rule__TypeBodyElements__Alternatives");
					put(grammarAccess.getFunctionBodyAccess().getAlternatives(), "rule__FunctionBody__Alternatives");
					put(grammarAccess.getRootExpressionAccess().getAlternatives(), "rule__RootExpression__Alternatives");
					put(grammarAccess.getQuantifierAccess().getAlternatives_0(), "rule__Quantifier__Alternatives_0");
					put(grammarAccess.getInfixAccess().getAlternatives_1_1(), "rule__Infix__Alternatives_1_1");
					put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
					put(grammarAccess.getExpressionVariableAccess().getAlternatives(), "rule__ExpressionVariable__Alternatives");
					put(grammarAccess.getTypeInstanceAccess().getAlternatives(), "rule__TypeInstance__Alternatives");
					put(grammarAccess.getInbuiltInfixAccess().getAlternatives(), "rule__InbuiltInfix__Alternatives");
					put(grammarAccess.getTHM_NAMEAccess().getGroup(), "rule__THM_NAME__Group__0");
					put(grammarAccess.getImportStatementAccess().getGroup(), "rule__ImportStatement__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getImportAccess().getGroup_1(), "rule__Import__Group_1__0");
					put(grammarAccess.getClassAccess().getGroup(), "rule__Class__Group__0");
					put(grammarAccess.getPolyContextAccess().getGroup(), "rule__PolyContext__Group__0");
					put(grammarAccess.getPolyContextTypesAccess().getGroup(), "rule__PolyContextTypes__Group__0");
					put(grammarAccess.getPolyTypeConstraintsAccess().getGroup(), "rule__PolyTypeConstraints__Group__0");
					put(grammarAccess.getPolyTypeConstraintsAccess().getGroup_2(), "rule__PolyTypeConstraints__Group_2__0");
					put(grammarAccess.getSuperTypeListAccess().getGroup(), "rule__SuperTypeList__Group__0");
					put(grammarAccess.getSuperTypeListAccess().getGroup_2(), "rule__SuperTypeList__Group_2__0");
					put(grammarAccess.getConstructedTypeAccess().getGroup(), "rule__ConstructedType__Group__0");
					put(grammarAccess.getConstructedTypeAccess().getGroup_1(), "rule__ConstructedType__Group_1__0");
					put(grammarAccess.getTypeConstructorAccess().getGroup(), "rule__TypeConstructor__Group__0");
					put(grammarAccess.getTypeDeclContextAccess().getGroup(), "rule__TypeDeclContext__Group__0");
					put(grammarAccess.getTypeDeclContextAccess().getGroup_2(), "rule__TypeDeclContext__Group_2__0");
					put(grammarAccess.getTypeStructureAccess().getGroup(), "rule__TypeStructure__Group__0");
					put(grammarAccess.getWhereAccess().getGroup(), "rule__Where__Group__0");
					put(grammarAccess.getWhereAccess().getGroup_2(), "rule__Where__Group_2__0");
					put(grammarAccess.getDatatypeAccess().getGroup(), "rule__Datatype__Group__0");
					put(grammarAccess.getDatatypeConstructorAccess().getGroup(), "rule__DatatypeConstructor__Group__0");
					put(grammarAccess.getDTypeConstructorAccess().getGroup(), "rule__DTypeConstructor__Group__0");
					put(grammarAccess.getExtendAccess().getGroup(), "rule__Extend__Group__0");
					put(grammarAccess.getFunctionDeclAccess().getGroup(), "rule__FunctionDecl__Group__0");
					put(grammarAccess.getFuncInductiveAccess().getGroup(), "rule__FuncInductive__Group__0");
					put(grammarAccess.getFuncInductiveCaseAccess().getGroup(), "rule__FuncInductiveCase__Group__0");
					put(grammarAccess.getTheoremBodyAccess().getGroup(), "rule__TheoremBody__Group__0");
					put(grammarAccess.getTheoremDeclAccess().getGroup(), "rule__TheoremDecl__Group__0");
					put(grammarAccess.getTypedVariableListAccess().getGroup(), "rule__TypedVariableList__Group__0");
					put(grammarAccess.getTypedVariableListAccess().getGroup_1(), "rule__TypedVariableList__Group_1__0");
					put(grammarAccess.getVariableTypingAccess().getGroup(), "rule__VariableTyping__Group__0");
					put(grammarAccess.getVariableTypingAccess().getGroup_1(), "rule__VariableTyping__Group_1__0");
					put(grammarAccess.getTypeDeclarationAccess().getGroup(), "rule__TypeDeclaration__Group__0");
					put(grammarAccess.getLambdaAccess().getGroup(), "rule__Lambda__Group__0");
					put(grammarAccess.getQuantifierAccess().getGroup(), "rule__Quantifier__Group__0");
					put(grammarAccess.getPrefixAccess().getGroup(), "rule__Prefix__Group__0");
					put(grammarAccess.getInfixAccess().getGroup(), "rule__Infix__Group__0");
					put(grammarAccess.getInfixAccess().getGroup_1(), "rule__Infix__Group_1__0");
					put(grammarAccess.getBracketAccess().getGroup(), "rule__Bracket__Group__0");
					put(grammarAccess.getFunctionCallAccess().getGroup(), "rule__FunctionCall__Group__0");
					put(grammarAccess.getFunctionCallAccess().getGroup_1(), "rule__FunctionCall__Group_1__0");
					put(grammarAccess.getFunctionCallAccess().getGroup_1_2(), "rule__FunctionCall__Group_1_2__0");
					put(grammarAccess.getTypeInstanceAccess().getGroup_1(), "rule__TypeInstance__Group_1__0");
					put(grammarAccess.getTypeInstanceAccess().getGroup_1_1(), "rule__TypeInstance__Group_1_1__0");
					put(grammarAccess.getInstanceAccess().getGroup(), "rule__Instance__Group__0");
					put(grammarAccess.getInstanceAccess().getGroup_5(), "rule__Instance__Group_5__0");
					put(grammarAccess.getDomainModelAccess().getElementsAssignment(), "rule__DomainModel__ElementsAssignment");
					put(grammarAccess.getImportStatementAccess().getImportsAssignment_1(), "rule__ImportStatement__ImportsAssignment_1");
					put(grammarAccess.getImportAccess().getImportNameAssignment_0(), "rule__Import__ImportNameAssignment_0");
					put(grammarAccess.getImportAccess().getImportNameAssignment_1_1(), "rule__Import__ImportNameAssignment_1_1");
					put(grammarAccess.getImportComponentAccess().getNameAssignment(), "rule__ImportComponent__NameAssignment");
					put(grammarAccess.getClassAccess().getTypeNameAssignment_1(), "rule__Class__TypeNameAssignment_1");
					put(grammarAccess.getClassAccess().getContextAssignment_2(), "rule__Class__ContextAssignment_2");
					put(grammarAccess.getClassAccess().getSupertypesAssignment_3(), "rule__Class__SupertypesAssignment_3");
					put(grammarAccess.getClassAccess().getVarListAssignment_4(), "rule__Class__VarListAssignment_4");
					put(grammarAccess.getClassAccess().getWhereAssignment_5(), "rule__Class__WhereAssignment_5");
					put(grammarAccess.getClassAccess().getBodyElementsAssignment_8(), "rule__Class__BodyElementsAssignment_8");
					put(grammarAccess.getTypeNameAccess().getNameAssignment(), "rule__TypeName__NameAssignment");
					put(grammarAccess.getPolymorphicTypeNameAccess().getNameAssignment(), "rule__PolymorphicTypeName__NameAssignment");
					put(grammarAccess.getPolyContextAccess().getPolyTypesAssignment_1(), "rule__PolyContext__PolyTypesAssignment_1");
					put(grammarAccess.getPolyContextTypesAccess().getNameAssignment_0(), "rule__PolyContextTypes__NameAssignment_0");
					put(grammarAccess.getPolyContextTypesAccess().getConstraintsAssignment_1(), "rule__PolyContextTypes__ConstraintsAssignment_1");
					put(grammarAccess.getPolyTypeConstraintsAccess().getTypeNameAssignment_1(), "rule__PolyTypeConstraints__TypeNameAssignment_1");
					put(grammarAccess.getPolyTypeConstraintsAccess().getTypeNameAssignment_2_1(), "rule__PolyTypeConstraints__TypeNameAssignment_2_1");
					put(grammarAccess.getSuperTypeListAccess().getSuperTypeAssignment_1(), "rule__SuperTypeList__SuperTypeAssignment_1");
					put(grammarAccess.getSuperTypeListAccess().getSuperTypeAssignment_2_1(), "rule__SuperTypeList__SuperTypeAssignment_2_1");
					put(grammarAccess.getConstructedTypeAccess().getTypeAssignment_0(), "rule__ConstructedType__TypeAssignment_0");
					put(grammarAccess.getConstructedTypeAccess().getTypeAssignment_1_1(), "rule__ConstructedType__TypeAssignment_1_1");
					put(grammarAccess.getTypeConstructorAccess().getTypeNameAssignment_0_0(), "rule__TypeConstructor__TypeNameAssignment_0_0");
					put(grammarAccess.getTypeConstructorAccess().getContextAssignment_1(), "rule__TypeConstructor__ContextAssignment_1");
					put(grammarAccess.getTypeDeclContextAccess().getTypeNameAssignment_1(), "rule__TypeDeclContext__TypeNameAssignment_1");
					put(grammarAccess.getTypeDeclContextAccess().getTypeNameAssignment_2_1(), "rule__TypeDeclContext__TypeNameAssignment_2_1");
					put(grammarAccess.getTypeStructureAccess().getVariablesAssignment_1(), "rule__TypeStructure__VariablesAssignment_1");
					put(grammarAccess.getWhereAccess().getExpessionsAssignment_1(), "rule__Where__ExpessionsAssignment_1");
					put(grammarAccess.getWhereAccess().getExpressionsAssignment_2_1(), "rule__Where__ExpressionsAssignment_2_1");
					put(grammarAccess.getDatatypeAccess().getNameAssignment_1(), "rule__Datatype__NameAssignment_1");
					put(grammarAccess.getDatatypeAccess().getContextAssignment_2(), "rule__Datatype__ContextAssignment_2");
					put(grammarAccess.getDatatypeAccess().getConstructorsAssignment_3(), "rule__Datatype__ConstructorsAssignment_3");
					put(grammarAccess.getDatatypeAccess().getBodyElementsAssignment_5(), "rule__Datatype__BodyElementsAssignment_5");
					put(grammarAccess.getBaseConstructorAccess().getNameAssignment(), "rule__BaseConstructor__NameAssignment");
					put(grammarAccess.getDTypeConstructorAccess().getNameAssignment_0(), "rule__DTypeConstructor__NameAssignment_0");
					put(grammarAccess.getDTypeConstructorAccess().getDeconsAssignment_2(), "rule__DTypeConstructor__DeconsAssignment_2");
					put(grammarAccess.getExtendAccess().getNameAssignment_0(), "rule__Extend__NameAssignment_0");
					put(grammarAccess.getExtendAccess().getExtesnionAssignment_2(), "rule__Extend__ExtesnionAssignment_2");
					put(grammarAccess.getExtendAccess().getBodyElementsAssignment_5(), "rule__Extend__BodyElementsAssignment_5");
					put(grammarAccess.getTypeBodyElementsAccess().getFunctionsAssignment_0(), "rule__TypeBodyElements__FunctionsAssignment_0");
					put(grammarAccess.getTypeBodyElementsAccess().getTheoremsAssignment_1(), "rule__TypeBodyElements__TheoremsAssignment_1");
					put(grammarAccess.getFunctionDeclAccess().getNameAssignment_0(), "rule__FunctionDecl__NameAssignment_0");
					put(grammarAccess.getFunctionDeclAccess().getContextAssignment_1(), "rule__FunctionDecl__ContextAssignment_1");
					put(grammarAccess.getFunctionDeclAccess().getVarListAssignment_3(), "rule__FunctionDecl__VarListAssignment_3");
					put(grammarAccess.getFunctionDeclAccess().getReturnTypeAssignment_6(), "rule__FunctionDecl__ReturnTypeAssignment_6");
					put(grammarAccess.getFunctionDeclAccess().getBodyAssignment_7(), "rule__FunctionDecl__BodyAssignment_7");
					put(grammarAccess.getFunctionNameAccess().getNameAssignment(), "rule__FunctionName__NameAssignment");
					put(grammarAccess.getFuncDirectDefAccess().getExpressionAssignment(), "rule__FuncDirectDef__ExpressionAssignment");
					put(grammarAccess.getFuncInductiveAccess().getVariableNameAssignment_1(), "rule__FuncInductive__VariableNameAssignment_1");
					put(grammarAccess.getFuncInductiveAccess().getInductCaseAssignment_2(), "rule__FuncInductive__InductCaseAssignment_2");
					put(grammarAccess.getFuncInductiveAccess().getInductCaseAssignment_3(), "rule__FuncInductive__InductCaseAssignment_3");
					put(grammarAccess.getFuncInductiveCaseAccess().getDeconNameAssignment_1(), "rule__FuncInductiveCase__DeconNameAssignment_1");
					put(grammarAccess.getFuncInductiveCaseAccess().getExpreAssignment_3(), "rule__FuncInductiveCase__ExpreAssignment_3");
					put(grammarAccess.getTheoremBodyAccess().getTheoremDeclAssignment_2(), "rule__TheoremBody__TheoremDeclAssignment_2");
					put(grammarAccess.getTheoremDeclAccess().getThmNameAssignment_0(), "rule__TheoremDecl__ThmNameAssignment_0");
					put(grammarAccess.getTheoremDeclAccess().getExpAssignment_1(), "rule__TheoremDecl__ExpAssignment_1");
					put(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeAssignment_0(), "rule__TypedVariableList__VariablesOfTypeAssignment_0");
					put(grammarAccess.getTypedVariableListAccess().getVariablesOfTypeAssignment_1_1(), "rule__TypedVariableList__VariablesOfTypeAssignment_1_1");
					put(grammarAccess.getVariableTypingAccess().getTypeVarAssignment_0(), "rule__VariableTyping__TypeVarAssignment_0");
					put(grammarAccess.getVariableTypingAccess().getTypeVarAssignment_1_1(), "rule__VariableTyping__TypeVarAssignment_1_1");
					put(grammarAccess.getVariableTypingAccess().getTypeAssignment_3(), "rule__VariableTyping__TypeAssignment_3");
					put(grammarAccess.getTypedVariableAccess().getNameAssignment(), "rule__TypedVariable__NameAssignment");
					put(grammarAccess.getTypeDeclarationAccess().getTypeNameAssignment_0(), "rule__TypeDeclaration__TypeNameAssignment_0");
					put(grammarAccess.getTypeDeclarationAccess().getContextAssignment_1(), "rule__TypeDeclaration__ContextAssignment_1");
					put(grammarAccess.getExpressionAccess().getNameAssignment(), "rule__Expression__NameAssignment");
					put(grammarAccess.getLambdaAccess().getContextAssignment_1(), "rule__Lambda__ContextAssignment_1");
					put(grammarAccess.getLambdaAccess().getVarListAssignment_2(), "rule__Lambda__VarListAssignment_2");
					put(grammarAccess.getLambdaAccess().getExprAssignment_4(), "rule__Lambda__ExprAssignment_4");
					put(grammarAccess.getQuantifierAccess().getContextAssignment_1(), "rule__Quantifier__ContextAssignment_1");
					put(grammarAccess.getQuantifierAccess().getVarListAssignment_2(), "rule__Quantifier__VarListAssignment_2");
					put(grammarAccess.getQuantifierAccess().getExprAssignment_4(), "rule__Quantifier__ExprAssignment_4");
					put(grammarAccess.getPrefixAccess().getNameAssignment_0(), "rule__Prefix__NameAssignment_0");
					put(grammarAccess.getPrefixAccess().getElemAssignment_1(), "rule__Prefix__ElemAssignment_1");
					put(grammarAccess.getInfixAccess().getFuncNameAssignment_1_1_0(), "rule__Infix__FuncNameAssignment_1_1_0");
					put(grammarAccess.getInfixAccess().getOpNameAssignment_1_1_1(), "rule__Infix__OpNameAssignment_1_1_1");
					put(grammarAccess.getInfixAccess().getRightAssignment_1_2(), "rule__Infix__RightAssignment_1_2");
					put(grammarAccess.getFunctionCallAccess().getTypeInstAssignment_0(), "rule__FunctionCall__TypeInstAssignment_0");
					put(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_1_1(), "rule__FunctionCall__ArgumentsAssignment_1_1");
					put(grammarAccess.getFunctionCallAccess().getArgumentsAssignment_1_2_1(), "rule__FunctionCall__ArgumentsAssignment_1_2_1");
					put(grammarAccess.getTypeInstanceAccess().getInstanceAssignment_0(), "rule__TypeInstance__InstanceAssignment_0");
					put(grammarAccess.getTypeInstanceAccess().getTypeNameAssignment_1_0(), "rule__TypeInstance__TypeNameAssignment_1_0");
					put(grammarAccess.getTypeInstanceAccess().getElementAssignment_1_1_1(), "rule__TypeInstance__ElementAssignment_1_1_1");
					put(grammarAccess.getInbuiltTypeScanAccess().getNameAssignment(), "rule__InbuiltTypeScan__NameAssignment");
					put(grammarAccess.getInstanceAccess().getClassNameAssignment_1(), "rule__Instance__ClassNameAssignment_1");
					put(grammarAccess.getInstanceAccess().getContextAssignment_2(), "rule__Instance__ContextAssignment_2");
					put(grammarAccess.getInstanceAccess().getArgumentsAssignment_4(), "rule__Instance__ArgumentsAssignment_4");
					put(grammarAccess.getInstanceAccess().getArgumentsAssignment_5_1(), "rule__Instance__ArgumentsAssignment_5_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
