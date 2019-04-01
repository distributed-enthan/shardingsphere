/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.core.parse.antlr.extractor.util;

import lombok.RequiredArgsConstructor;

/**
 * Rule name.
 * 
 * @author zhangliang
 */
@RequiredArgsConstructor
public enum RuleName {
    
    TABLE_NAME("TableName"),
    
    COLUMN_DEFINITION("ColumnDefinition"),
    
    COLUMN_NAME("ColumnName"),
    
    DATA_TYPE("DataType"),
    
    DATA_TYPE_LENGTH("DataTypeLength"),
    
    FIRST_OR_AFTER_COLUMN("FirstOrAfterColumn"),
    
    PRIMARY_KEY("PrimaryKey"),
    
    COLUMN_NAMES("ColumnNames"),
    
    INDEX_NAME("IndexName"),
    
    ADD_COLUMN_SPECIFICATION("AddColumnSpecification"),
    
    CHANGE_COLUMN_SPECIFICATION("ChangeColumnSpecification"),
    
    DROP_COLUMN_SPECIFICATION("DropColumnSpecification"),
    
    MODIFY_COLUMN_SPECIFICATION("ModifyColumnSpecification"),
    
    RENAME_COLUMN_SPECIFICATION("RenameColumnSpecification"),
    
    DROP_PRIMARY_KEY_SPECIFICATION("DropPrimaryKeySpecification"),
    
    RENAME_TABLE_SPECIFICATION("RenameTableSpecification"),
    
    // TODO hongjun: parse AddIndex
    ADD_INDEX_SPECIFICATION("AddIndexSpecification"),
    
    RENAME_INDEX_SPECIFICATION("RenameIndexSpecification"),
    
    DROP_INDEX_SPECIFICATION("DropIndexSpecification"),
    
    // TODO hongjun: parse AddConstraint
    ADD_CONSTRAINT_SPECIFICATION("AddConstraintSpecification"),
    
    DROP_CONSTRAINT_CLAUSE("DropConstraintClause"),
    
    MODIFY_COL_PROPERTIES("ModifyColProperties"),
    
    INSERT_COLUMNS_CLAUSE("InsertColumnsClause"),
    
    INSERT_VALUES_CLAUSE("InsertValuesClause"),
    
    INSERT_ON_DUPLICATE_KEY_CLAUSE("InsertOnDuplicateKeyClause"),
    
    SET_ASSIGNMENTS_CLAUSE("SetAssignmentsClause"),
    
    ASSIGNMENT_VALUES("AssignmentValues"),
    
    ASSIGNMENT_VALUE("AssignmentValue"),
    
    ASSIGNMENTS("Assignments"),
    
    ASSIGNMENT("Assignment"),
    
    SELECT_CLAUSE("SelectClause"),
    
    SELECT_SPECIFICATION("SelectSpecification"),
    
    SELECT_EXPRS("SelectExprs"),
    
    UNQUALIFIED_SHORTHAND("UnqualifiedShorthand"),
    
    QUALIFIED_SHORTHAND("QualifiedShorthand"),
    
    SELECT_EXPR("SelectExpr"),
    
    FUNCTION_CALL("FunctionCall"),
    
    DISTINCT("Distinct"),
    
    TABLE_CONSTRAINT("TableConstraint"),
    
    TABLE_REFERENCES("TableReferences"),
    
    TABLE_REFERENCE("TableReference"),
    
    TABLE_FACTOR("TableFactor"),
    
    JOIN_TABLE("JoinTable"),
    
    JOIN_CONDITION("JoinCondition"),
    
    ALIAS("Alias"),
    
    QUESTION("Question"),
    
    NUMBER("Number"),
    
    STRING("String"),
    
    EXPR("Expr"),
    
    SIMPLE_EXPR("SimpleExpr"),
    
    BIT_EXPR("BitExpr"),
    
    FROM_CLAUSE("FromClause"),
    
    WHERE_CLAUSE("WhereClause"),
    
    GROUP_BY_CLAUSE("GroupByClause"),
    
    ORDER_BY_CLAUSE("OrderByClause"),
    
    ORDER_BY_ITEM("OrderByItem"),
    
    COMPARISON_OPERATOR("ComparisonOperator"),
    
    PREDICATE("Predicate"),
    
    LIMIT_CLAUSE("LimitClause"),
    
    RANGE_CLAUSE("RangeClause"),
    
    SUBQUERY("Subquery"),
    
    SHOW_PARAM("ShowParam"),
    
    AUTO_COMMIT_VALUE("AutoCommitValue"),
    
    DELETE("Delete"),
    
    DELETE_CLAUSE("DeleteClause");
    
    private final String name;
    
    /**
     * Get name.
     * 
     * @return name
     */
    public String getName() {
        return name + "Context";
    }
}