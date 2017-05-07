package be.planetsizebrain.liferay.hook.events.layout;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
				"key=layout.configuration.action.update",
				"service.ranking:Integer=1000"
		},
		service = LifecycleAction.class
)
public class FirstPageUpdateAction implements LifecycleAction {

	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {
		System.out.println("First page update action");
	}
}