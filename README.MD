# Liferay DXP livecycle event order demonstration

This code demonstrates how the @Component property **service.ranking** can be used to make sure your custom livecycle event implementations are executed in the correct order.

The different Liferay DXP livecycle events and their order are:
* Once during a server start/stop cycle:
    * global.startup.events
    * application.startup.events (1 for every portal instance ID)
    * application.shutdown.events (1 for every portal instance ID)
    * global.shutdown.events
* For every login:
    * servlet.service.events.pre
    * servlet.session.create.events
    * servlet.service.events.post
    * login.events.pre
    * login.events.post
* For every logout:
    * servlet.service.events.pre
    * logout.events.pre
    * servlet.session.destroy.events
    * logout.events.post
    * servlet.service.events.post
* For every other HTTP request:
    * servlet.service.events.pre
    * servlet.service.events.post
* For every page that is updated:
    * servlet.service.events.pre
    * layout.configuration.action.update
    * servlet.service.events.post
* For every page that is added/updated:
    * servlet.service.events.pre
    * layout.configuration.action.delete
    * servlet.service.events.post