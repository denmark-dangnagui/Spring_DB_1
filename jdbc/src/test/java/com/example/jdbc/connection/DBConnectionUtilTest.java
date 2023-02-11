package com.example.jdbc.connection;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

public class DBConnectionUtilTest {

    @Test
    void connection() {
        Connection connection = DBConnectionUtil.getConnction();
        Assertions.assertThat(connection).isNotNull();
    }
}
