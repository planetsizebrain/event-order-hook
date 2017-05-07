package be.planetsizebrain.liferay.hook.events.servlet.session;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
				"key=servlet.session.create.events",
				"service.ranking:Integer=1000"
		},
		service = LifecycleAction.class
)
public class FirstSessionCreateAction implements LifecycleAction {

	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {
		System.out.println("First session create action");
	}
}