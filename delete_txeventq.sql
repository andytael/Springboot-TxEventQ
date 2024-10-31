begin
    -- first we need to stop the TEQ
    dbms_aqadm.stop_queue(
            queue_name     => 'TESTUSER.MY_TXEVENTQ'
    );

    -- now we can drop the TEQ
    dbms_aqadm.drop_transactional_event_queue(
            queue_name     => 'TESTUSER.MY_TXEVENTQ'
    );
end;
/