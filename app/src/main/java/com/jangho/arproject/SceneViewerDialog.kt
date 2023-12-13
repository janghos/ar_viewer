import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Window
import android.widget.Button
import com.jangho.arproject.R


class SceneViewerDialog(context: Context) : Dialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.dialog_scene_viewer)

        findViewById<Button>(R.id.btnOpenSceneViewer).setOnClickListener {
            dismiss()
            openSceneViewer()
        }
    }

    private fun openSceneViewer() {
        val sceneViewerIntent = Intent(Intent.ACTION_VIEW)
        sceneViewerIntent.flags = Intent.FLAG_ACTIVITY_NO_HISTORY
        sceneViewerIntent.data = Uri.parse("https://arvr.google.com/scene-viewer/1.0?file=https://appleobjectmodeling.s3.ap-northeast-2.amazonaws.com/modelFile/model-mobile+9.glb&title=뉴발란스 AOS test viewer")
        sceneViewerIntent.setPackage("com.google.android.googlequicksearchbox")
        context.startActivity(sceneViewerIntent)
    }
}