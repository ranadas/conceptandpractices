package com.rdas.rest.dbaccess;

import com.google.common.base.Optional;
import com.rdas.rest.dbaccess.core.request.db.EscrowRequestRowMapper;
import com.rdas.rest.model.EscrowRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.Date;
import java.util.List;

/**
 * Created by rdas on 24/01/2015.
 */
@Component
public class EscrowRequestRetriever {

    //@Formatter:off
    static final String FIND_BY_ID_QUERY =
            "SELECT er.id, er.repository_identifier, er.tld, er.watermark, er.resend_counter, coalesce(lert.deposit_counter, 1) as deposit_counter, er.report_type, er.create_date " +
            "FROM escrow_request er " +
            "LEFT JOIN last_escrow_request_tracking_view lert ON lert.escrow_request_id = er.id " +
            "WHERE er.id = ? ";

    static final String FIND_BY_DATE_QUERY_AND_TLDS =
            "SELECT er.id, er.repository_identifier, er.tld, er.watermark, er.resend_counter, coalesce(lert.deposit_counter, 1) as deposit_counter, er.report_type, er.create_date " +
                    "FROM escrow_request er " +
                    "LEFT JOIN last_escrow_request_tracking_view lert ON lert.escrow_request_id = er.id " +
                    "WHERE " +
                    "er.create_date::date = :search_date "+
                    "AND er.tld in (:tlds) ";
    //@Formatter:on
    @Autowired
    private DataSource dataSource;

    @Autowired
    private EscrowRequestRowMapper escrowRequestRowMapper;

    public void getER() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public Optional<EscrowRequest> getById(Long id) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        List<EscrowRequest> found = jdbcTemplate.query(FIND_BY_ID_QUERY, new Object[]{id}, escrowRequestRowMapper);
        return Optional.fromNullable(DataAccessUtils.singleResult(found));
    }

    public List<EscrowRequest> findRequests(Date date, List<String> tlds) {
        NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);

        MapSqlParameterSource args = new MapSqlParameterSource();
        //args.addValue("ids", Arrays.asList(new Object[] {new Integer(3), new Integer(4)}));
        args.addValue("search_date", date);
        args.addValue("tlds", tlds);

        //List<Customer> customers = template.query(sql, args, customerMapper);
        //List<Customer> customers = template.query(sql, args, customerMapper);
        //List<Customer> customers = template.query(sql, args, customerMapper);
        //List<Customer> customers = template.query(sql, args, customerMapper);
        //List<Customer> customers = template.query(sql, args, customerMapper);
        //List<Customer> customers = template.query(sql, args, customerMapper);
        //List<EscrowRequest> list =  jdbcTemplate.query(FIND_BY_DATE_QUERY_AND_TLDS, escrowRequestRowMapper, args);
        //SqlRowSet s = jdbcTemplate.queryForRowSet(FIND_BY_DATE_QUERY_AND_TLDS, args);
        List<EscrowRequest> l = jdbcTemplate.query(FIND_BY_DATE_QUERY_AND_TLDS, args, escrowRequestRowMapper);
        return l;

    }
}
