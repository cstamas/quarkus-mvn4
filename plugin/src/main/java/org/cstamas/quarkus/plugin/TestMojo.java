package org.cstamas.quarkus.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.eclipse.aether.RepositorySystem;
import org.eclipse.aether.supplier.RepositorySystemSupplier;

@Mojo(name = "test", threadSafe = true)
public class TestMojo extends AbstractMojo {
    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        RepositorySystemSupplier supplier = new RepositorySystemSupplier();
        RepositorySystem rs = supplier.get();
        getLog().info("Using repository system " + rs);
    }
}
