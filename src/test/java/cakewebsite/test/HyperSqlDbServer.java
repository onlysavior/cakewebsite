package cakewebsite.test;

import org.hsqldb.Server;
import org.hsqldb.persist.HsqlProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.SmartLifecycle;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-21
 * Time: 上午10:57
 * To change this template use File | Settings | File Templates.
 */
public class HyperSqlDbServer implements SmartLifecycle
{
    private final Logger logger = LoggerFactory.getLogger(HyperSqlDbServer.class);
    private HsqlProperties properties;
    private Server server;
    private boolean running = false;

    public HyperSqlDbServer()
    {
        start();
    }

    @Override
    public boolean isRunning()
    {
        if (server != null)
            server.checkRunning(running);
        return running;
    }


    @Override
    public void start() {
        if (server == null) {
            logger.info("Starting HSQL server...");
            server = new Server();

            try
            {
                server.setDatabasePath(0,"mem:test");
                server.setDatabaseName(0,"test");
                server.start();
                running = true;
            } catch (Throwable e) {
                logger.error("error when starting db...",e);
            }
        }
    }


    @Override
    public void stop()
    {
        logger.info("Stopping HSQL server...");
        if (server != null)
        {
            server.stop();
            running = false;
        }
    }


    @Override
    public int getPhase()
    {
        return 0;
    }

    @Override
    public boolean isAutoStartup()
    {
        return true;
    }

    @Override
    public void stop(Runnable runnable)
    {
        stop();
        runnable.run();
    }
}
