import org.carlspring.maven.commons.util.ArtifactUtils
import org.carlspring.strongbox.client.ArtifactClient


def artifact = ArtifactUtils.getArtifactFromGAV("org.carlspring.maven:test-project:1.0.9");

def client = new ArtifactClient();

return client.artifactExists(artifact, "storage0", "releases-with-redeployment");
