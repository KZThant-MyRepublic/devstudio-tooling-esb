/*
 * Copyright 2012 WSO2, Inc. (http://wso2.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.configure;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.wso2.developerstudio.eclipse.gmf.esb.RouterMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.configure.ui.ConfigureRouterMediatorDialog;

public class ConfigureRouterMediatorAction extends ConfigureEsbNodeAction {

    public ConfigureRouterMediatorAction(IWorkbenchPart part) {
        super(part);
        setId("configure-router-mediator-action-id");
        setText("Configure...");
        setToolTipText("Configure Router mediator.");
        ISharedImages workbenchImages = PlatformUI.getWorkbench().getSharedImages();
        setImageDescriptor(workbenchImages.getImageDescriptor(ISharedImages.IMG_TOOL_NEW_WIZARD));
    }

    protected void doRun(IProgressMonitor progressMonitor) {
        EditPart selectedEP = getSelectedEditPart();
        Assert.isNotNull(selectedEP, "Empty selection.");

        EObject selectedObj = ((View) selectedEP.getModel()).getElement();
        Assert.isTrue(selectedObj instanceof RouterMediator, "Invalid selection.");

        Shell shell = Display.getDefault().getActiveShell();
        ConfigureRouterMediatorDialog configurationDialog = new ConfigureRouterMediatorDialog(shell,
                (RouterMediator) selectedObj, getEditingDomain());
        configurationDialog.setBlockOnOpen(true);
        configurationDialog.open();
    }

}
