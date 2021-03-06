/*
 * 
 */
package comrel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import comrel.diagram.providers.ComrelElementTypes;

/**
 * @generated
 */
public class SinglePortMappingItemSemanticEditPolicy extends
		ComrelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SinglePortMappingItemSemanticEditPolicy() {
		super(ComrelElementTypes.SinglePortMapping_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
