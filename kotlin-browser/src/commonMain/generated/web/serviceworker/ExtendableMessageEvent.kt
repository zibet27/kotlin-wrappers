// Automatically generated - do not modify!

package web.serviceworker

import js.array.ReadonlyArray
import js.core.JsAny
import js.reflect.unsafeCast
import web.events.EventType
import web.messaging.MessagePort
import kotlin.js.definedExternally

/**
 * The **`ExtendableMessageEvent`** interface of the Service Worker API represents the event object of a ServiceWorkerGlobalScope/message_event event fired on a service worker (when a message is received on the ServiceWorkerGlobalScope from another context) — extends the lifetime of such events.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent)
 */
open external class ExtendableMessageEvent(
    override val type: EventType<ExtendableMessageEvent>,
    init: ExtendableMessageEventInit = definedExternally,
) : ExtendableEvent {
    /**
     * The **`data`** read-only property of the data type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/data)
     */
    val data: JsAny?

    /**
     * The **`lastEventID`** read-only property of the A string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/lastEventId)
     */
    val lastEventId: String

    /**
     * The **`origin`** read-only property of the A string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/origin)
     */
    val origin: String

    /**
     * The **`ports`** read-only property of the channel (the channel the message is being sent through.) An array of MessagePort objects.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/ports)
     */
    val ports: ReadonlyArray<MessagePort>

    /**
     * The **`source`** read-only property of the A Client, ServiceWorker or MessagePort object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/source)
     */
    val source: JsAny /* Client | ServiceWorker | MessagePort */?

    companion object
}

inline fun ExtendableMessageEvent.asInit(): ExtendableMessageEventInit =
    unsafeCast(this)

inline val ExtendableMessageEvent.Companion.MESSAGE: EventType<ExtendableMessageEvent>
    get() = EventType("message")
