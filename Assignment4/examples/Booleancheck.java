MAIN
    PRINT 
    BEGIN
        MOVE TEMP 32
            BEGIN
                MOVE TEMP 34 HALLOCATE 4
                MOVE TEMP 35 HALLOCATE 4
                HSTORE TEMP 35 0 Size_4_Test_foo
                MOVE TEMP 36 4
                L0
                CJUMP LT TEMP 36 4 L1
                HSTORE PLUS TEMP 34 TEMP 36 0 0
                MOVE TEMP 36 PLUS TEMP 36 4
                JUMP L0
                L1
                HSTORE TEMP 34 0 TEMP 35
                RETURN TEMP 34
            END
        HLOAD TEMP 37 TEMP 32 0
        HLOAD TEMP 38 TEMP 37 0
        RETURN
        CALL TEMP 38
        (
            TEMP 32
        )
    END
END
    Size_4_Test_foo [ 0 ]
    BEGIN
        MOVE TEMP 31
            1
        CJUMP
            BEGIN
                RETURN TEMP 31
            END
            L2
            MOVE TEMP 31
                1
            JUMP L3
            L2 NOOP
            MOVE TEMP 31
                1
            L3
            NOOP
        MOVE TEMP 39
        0
        RETURN TEMP 39
    END
