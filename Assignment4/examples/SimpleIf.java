MAIN
    PRINT 
    BEGIN
        MOVE TEMP 31
            BEGIN
                MOVE TEMP 33 HALLOCATE 4
                MOVE TEMP 34 HALLOCATE 4
                HSTORE TEMP 34 0 Size_4_Test_foo
                MOVE TEMP 35 4
                L0
                CJUMP LT TEMP 35 4 L1
                HSTORE PLUS TEMP 33 TEMP 35 0 0
                MOVE TEMP 35 PLUS TEMP 35 4
                JUMP L0
                L1
                HSTORE TEMP 33 0 TEMP 34
                RETURN TEMP 33
            END
        HLOAD TEMP 36 TEMP 31 0
        HLOAD TEMP 37 TEMP 36 0
        RETURN
        CALL TEMP 37
        (
            TEMP 31
            0
        )
    END
END
    Size_4_Test_foo [ 1 ]
    BEGIN
        CJUMP
            BEGIN
                RETURN TEMP 1
            END
            L2
            JUMP L3
            L2 NOOP
            L3
            NOOP
        MOVE TEMP 38
        33
        RETURN TEMP 38
    END
