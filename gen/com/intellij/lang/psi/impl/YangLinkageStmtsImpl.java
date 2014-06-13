// This is a generated file. Not intended for manual editing.
package com.intellij.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.yang.psi.YangTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.psi.*;

public class YangLinkageStmtsImpl extends ASTWrapperPsiElement implements YangLinkageStmts {

  public YangLinkageStmtsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) ((YangVisitor)visitor).visitLinkageStmts(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YangImportStmt> getImportStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangImportStmt.class);
  }

  @Override
  @NotNull
  public List<YangIncludeStmt> getIncludeStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangIncludeStmt.class);
  }

}