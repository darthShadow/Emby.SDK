/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.5
 */

package EmbyClient.Java.Beta;

import io.swagger.client.model.NetEndPointInfo;
import io.swagger.client.model.PublicSystemInfo;
import io.swagger.client.model.QueryResultLogFile;
import io.swagger.client.model.QueryResultString;
import io.swagger.client.model.SystemInfo;
import io.swagger.client.model.UpdatesPackageVersionInfo;
import io.swagger.client.model.WakeOnLanInfo;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for SystemServiceApi
 */
@Ignore
public class SystemServiceApiTest {

    private final SystemServiceApi api = new SystemServiceApi();

    /**
     * Gets information about the request endpoint
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSystemEndpointTest() throws Exception {
        NetEndPointInfo response = api.getSystemEndpoint();

        // TODO: test validations
    }
    /**
     * Gets information about the server
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSystemInfoTest() throws Exception {
        SystemInfo response = api.getSystemInfo();

        // TODO: test validations
    }
    /**
     * Gets public information about the server
     *
     * No authentication required
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSystemInfoPublicTest() throws Exception {
        PublicSystemInfo response = api.getSystemInfoPublic();

        // TODO: test validations
    }
    /**
     * Gets a log file
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSystemLogsByNameTest() throws Exception {
        String name = null;
        Boolean sanitize = null;
        api.getSystemLogsByName(name, sanitize);

        // TODO: test validations
    }
    /**
     * Gets a log file
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSystemLogsByNameLinesTest() throws Exception {
        String name = null;
        QueryResultString response = api.getSystemLogsByNameLines(name);

        // TODO: test validations
    }
    /**
     * Gets a list of available server log files
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSystemLogsQueryTest() throws Exception {
        Integer startIndex = null;
        Integer limit = null;
        QueryResultLogFile response = api.getSystemLogsQuery(startIndex, limit);

        // TODO: test validations
    }
    /**
     * 
     *
     * No authentication required
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSystemPingTest() throws Exception {
        api.getSystemPing();

        // TODO: test validations
    }
    /**
     * Gets release notes
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSystemReleasenotesTest() throws Exception {
        UpdatesPackageVersionInfo response = api.getSystemReleasenotes();

        // TODO: test validations
    }
    /**
     * Gets release notes
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSystemReleasenotesVersionsTest() throws Exception {
        List<UpdatesPackageVersionInfo> response = api.getSystemReleasenotesVersions();

        // TODO: test validations
    }
    /**
     * Gets wake on lan information
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSystemWakeonlaninfoTest() throws Exception {
        List<WakeOnLanInfo> response = api.getSystemWakeonlaninfo();

        // TODO: test validations
    }
    /**
     * 
     *
     * No authentication required
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postSystemPingTest() throws Exception {
        api.postSystemPing();

        // TODO: test validations
    }
    /**
     * Restarts the application, if needed
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postSystemRestartTest() throws Exception {
        api.postSystemRestart();

        // TODO: test validations
    }
    /**
     * Shuts down the application
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postSystemShutdownTest() throws Exception {
        api.postSystemShutdown();

        // TODO: test validations
    }
}