/*
 * Copyright (c) 2024 Airbyte, Inc., all rights reserved.
 */

package io.airbyte.cdk.load.mock_integration_test

import io.airbyte.cdk.load.test.util.NoopDestinationCleaner
import io.airbyte.cdk.load.test.util.NoopExpectedRecordMapper
import io.airbyte.cdk.load.test.util.NoopNameMapper
import io.airbyte.cdk.load.write.BasicFunctionalityIntegrationTest
import org.junit.jupiter.api.Test

class MockBasicFunctionalityIntegrationTest :
    BasicFunctionalityIntegrationTest(
        MockDestinationSpecification.CONFIG,
        MockDestinationSpecification::class.java,
        MockDestinationDataDumper,
        NoopDestinationCleaner,
        NoopExpectedRecordMapper,
        NoopNameMapper
    ) {
    @Test
    override fun testBasicWrite() {
        super.testBasicWrite()
    }

    @Test
    override fun testMidSyncCheckpointingStreamState() {
        super.testMidSyncCheckpointingStreamState()
    }

    @Test
    override fun testNamespaces() {
        super.testNamespaces()
    }

    @Test
    override fun testFunkyStreamAndColumnNames() {
        super.testFunkyStreamAndColumnNames()
    }

    @Test
    override fun testTruncateRefresh() {
        super.testTruncateRefresh()
    }
}
