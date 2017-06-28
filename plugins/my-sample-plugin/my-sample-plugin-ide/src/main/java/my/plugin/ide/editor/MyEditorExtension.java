package my.plugin.ide.editor;

import com.google.inject.Inject;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultXMLDocumentHandler;
import org.eclipse.che.ide.api.editor.EditorRegistry;
import org.eclipse.che.ide.api.editor.defaulteditor.DefaultTextEditorProvider;
import org.eclipse.che.ide.api.extension.Extension;
import org.eclipse.che.ide.api.filetypes.FileType;
import org.eclipse.che.ide.api.filetypes.FileTypeRegistry;

@Extension(title = "Ecore Editor")
public class MyEditorExtension {
    @Inject
    public void registerForFiletype(final EditorRegistry editorRegistry,
                                    final FileTypeRegistry fileTypeRegistry,
                                    final @Named("EcoreFileType") FileType ecoreFile,
                                    final DefaultTextEditorProvider provider
                                    ){
        fileTypeRegistry.registerFileType(ecoreFile);
        editorRegistry.registerDefaultEditor(ecoreFile,provider);
    }
}

