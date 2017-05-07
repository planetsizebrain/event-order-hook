package be.planetsizebrain.liferay.hook.events.global;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
				"key=global.shutdown.events",
				"service.ranking:Integer=500"
		},
		service = LifecycleAction.class
)
public class SecondGlobalShutdownAction implements LifecycleAction {

	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {
		System.out.println("Second global shutdown action");
	}
}