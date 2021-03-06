/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb.impl;

import org.eclipse.emf.ecore.EClass;

import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.RuleSetCreationProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Set Creation Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RuleSetCreationPropertyImpl extends AbstractNameValuePropertyImpl implements RuleSetCreationProperty {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    protected RuleSetCreationPropertyImpl() {
        super();

        setPropertyName("property_name");
        setPropertyValue("property_value");
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */

    @Override
    protected EClass eStaticClass() {
        return EsbPackage.Literals.RULE_SET_CREATION_PROPERTY;
    }

} // RuleSetCreationPropertyImpl
