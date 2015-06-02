/*
 * Copyright 2013-2015, Teradata, Inc. All rights reserved.
 */
package com.teradata.benchmark.service.utils;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public final class TimeUtils
{

    public static final ZoneId UTC_ZONE = ZoneId.of("UTC");

    public static ZonedDateTime currentDateTime()
    {
        return ZonedDateTime.now(UTC_ZONE);
    }

    private TimeUtils()
    {
    }
}
