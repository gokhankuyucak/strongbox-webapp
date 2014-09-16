import org.carlspring.maven.commons.util.ArtifactUtils
import org.carlspring.strongbox.client.ArtifactClient


def artifact = ArtifactUtils.getArtifactFromGAV("org.carlspring.maven:test-project:1.0.6");

def client = ArtifactClient.getTestInstance();

return client.artifactExists(artifact, "storage0", "releases");
