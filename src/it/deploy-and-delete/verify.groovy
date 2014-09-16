import org.carlspring.maven.commons.util.ArtifactUtils
import org.carlspring.strongbox.client.ArtifactClient


def artifact = ArtifactUtils.getArtifactFromGAV("org.carlspring.maven:test-project:1.0.1");

def client = ArtifactClient.getTestInstance();

client.deleteArtifact(artifact, "storage0", "releases");

def artifactFile = new File("target/storages/storage0/releases/" +
                            "org/carlspring/maven/test-project/1.0.1/test-project-1.0.1.jar").getAbsoluteFile();

return !client.artifactExists(artifact, "storage0", "releases") && !artifactFile.exists();
