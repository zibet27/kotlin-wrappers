// Automatically generated - do not modify!

package web.mediarecorder

import js.objects.JsPlainObject
import web.blob.Blob
import web.events.EventInit
import web.time.DOMHighResTimeStamp

@JsPlainObject
external interface BlobEventInit :
    EventInit {
    var data: Blob
    var timecode: DOMHighResTimeStamp?
}
