package com.adaptris.amqpjmx.test;

import com.adaptris.interlok.boot.InterlokLauncher;
import com.adaptris.testing.SingleAdapterFunctionalTest;
import org.junit.jupiter.api.Test;

public class DefaultFunctionalTest extends SingleAdapterFunctionalTest {

    @Override
    protected Void launchAdapter() throws Exception {

        InterlokLauncher.main(new String[]{"./config/bootstrap.properties"});
        return null;
    }

    @Override
    public void setup() throws Exception {
        this.adapterStartMaxWaitTime = 30000;
        super.setup();
    }

    @Test
    public void test() throws Exception {
        // if we get to this point then it should be successful
        assert true;
    }
}
