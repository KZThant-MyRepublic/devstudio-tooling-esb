/**
 * Generated with Acceleo
 */
package org.wso2.developerstudio.eclipse.gmf.esb.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import org.wso2.developerstudio.eclipse.gmf.esb.parts.EsbViewsRepository;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.SwitchCaseParentContainerPropertiesEditionPart;

import org.wso2.developerstudio.eclipse.gmf.esb.providers.EsbMessages;

// End of user code

/**
 * 
 * 
 */
public class SwitchCaseParentContainerPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, SwitchCaseParentContainerPropertiesEditionPart {

	protected ReferencesTable switchCaseContainer;
	protected List<ViewerFilter> switchCaseContainerBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> switchCaseContainerFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public SwitchCaseParentContainerPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SwitchCaseParentContainerPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence switchCaseParentContainerStep = new BindingCompositionSequence(propertiesEditionComponent);
		switchCaseParentContainerStep
			.addStep(EsbViewsRepository.SwitchCaseParentContainer.Properties.class)
			.addStep(EsbViewsRepository.SwitchCaseParentContainer.Properties.switchCaseContainer);
		
		
		composer = new PartComposer(switchCaseParentContainerStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EsbViewsRepository.SwitchCaseParentContainer.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.SwitchCaseParentContainer.Properties.switchCaseContainer) {
					return createSwitchCaseContainerTableComposition(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(EsbMessages.SwitchCaseParentContainerPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createSwitchCaseContainerTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.switchCaseContainer = new ReferencesTable(getDescription(EsbViewsRepository.SwitchCaseParentContainer.Properties.switchCaseContainer, EsbMessages.SwitchCaseParentContainerPropertiesEditionPart_SwitchCaseContainerLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SwitchCaseParentContainerPropertiesEditionPartForm.this, EsbViewsRepository.SwitchCaseParentContainer.Properties.switchCaseContainer, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				switchCaseContainer.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SwitchCaseParentContainerPropertiesEditionPartForm.this, EsbViewsRepository.SwitchCaseParentContainer.Properties.switchCaseContainer, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				switchCaseContainer.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SwitchCaseParentContainerPropertiesEditionPartForm.this, EsbViewsRepository.SwitchCaseParentContainer.Properties.switchCaseContainer, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				switchCaseContainer.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SwitchCaseParentContainerPropertiesEditionPartForm.this, EsbViewsRepository.SwitchCaseParentContainer.Properties.switchCaseContainer, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				switchCaseContainer.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.switchCaseContainerFilters) {
			this.switchCaseContainer.addFilter(filter);
		}
		this.switchCaseContainer.setHelpText(propertiesEditionComponent.getHelpContent(EsbViewsRepository.SwitchCaseParentContainer.Properties.switchCaseContainer, EsbViewsRepository.FORM_KIND));
		this.switchCaseContainer.createControls(parent, widgetFactory);
		this.switchCaseContainer.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SwitchCaseParentContainerPropertiesEditionPartForm.this, EsbViewsRepository.SwitchCaseParentContainer.Properties.switchCaseContainer, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData switchCaseContainerData = new GridData(GridData.FILL_HORIZONTAL);
		switchCaseContainerData.horizontalSpan = 3;
		this.switchCaseContainer.setLayoutData(switchCaseContainerData);
		this.switchCaseContainer.setLowerBound(1);
		this.switchCaseContainer.setUpperBound(-1);
		switchCaseContainer.setID(EsbViewsRepository.SwitchCaseParentContainer.Properties.switchCaseContainer);
		switchCaseContainer.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createSwitchCaseContainerTableComposition

		// End of user code
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.SwitchCaseParentContainerPropertiesEditionPart#initSwitchCaseContainer(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initSwitchCaseContainer(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		switchCaseContainer.setContentProvider(contentProvider);
		switchCaseContainer.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.SwitchCaseParentContainer.Properties.switchCaseContainer);
		if (eefElementEditorReadOnlyState && switchCaseContainer.isEnabled()) {
			switchCaseContainer.setEnabled(false);
			switchCaseContainer.setToolTipText(EsbMessages.SwitchCaseParentContainer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !switchCaseContainer.isEnabled()) {
			switchCaseContainer.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.SwitchCaseParentContainerPropertiesEditionPart#updateSwitchCaseContainer()
	 * 
	 */
	public void updateSwitchCaseContainer() {
	switchCaseContainer.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.SwitchCaseParentContainerPropertiesEditionPart#addFilterSwitchCaseContainer(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSwitchCaseContainer(ViewerFilter filter) {
		switchCaseContainerFilters.add(filter);
		if (this.switchCaseContainer != null) {
			this.switchCaseContainer.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.SwitchCaseParentContainerPropertiesEditionPart#addBusinessFilterSwitchCaseContainer(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSwitchCaseContainer(ViewerFilter filter) {
		switchCaseContainerBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.SwitchCaseParentContainerPropertiesEditionPart#isContainedInSwitchCaseContainerTable(EObject element)
	 * 
	 */
	public boolean isContainedInSwitchCaseContainerTable(EObject element) {
		return ((ReferencesTableSettings)switchCaseContainer.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EsbMessages.SwitchCaseParentContainer_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
