package be.planetsizebrain.liferay.hook.events.servlet.session;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
				"key=servlet.session.destroy.events",
				"service.ranking:Integer=100"
		},
		service = LifecycleAction.class
)
public class ThirdSessionDestroyAction implements LifecycleAction {

	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {
		System.out.println("Third session destroy action");
	}
}