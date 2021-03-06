package be.planetsizebrain.liferay.hook.events.servlet.service;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
				"key=servlet.service.events.pre",
				"service.ranking:Integer=1000"
		},
		service = LifecycleAction.class
)
public class FirstServletServicePreAction implements LifecycleAction {

	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {
		System.out.println("First servlet service pre action");
	}
}