-- This must be executed as TESTUSER
begin
    -- create the TEQ
    dbms_aqadm.create_transactional_event_queue(
            queue_name         => 'TESTUSER.MY_TXEVENTQ',
        -- when mutiple_consumers is true, this will create a pub/sub "topic" - the default is false
            multiple_consumers => false
    );

    -- start the TEQ
    dbms_aqadm.start_queue(
            queue_name         => 'TESTUSER.MY_TXEVENTQ'
    );
end;
/