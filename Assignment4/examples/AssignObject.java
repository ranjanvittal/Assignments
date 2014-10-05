MAIN
    PRINT 
    BEGIN
        MOVE TEMP 32
            BEGIN
                MOVE TEMP 34 HALLOCATE 8
                MOVE TEMP 35 HALLOCATE 4
                HSTORE TEMP 35 0 Size_4_Test_foo
                MOVE TEMP 36 4
                L0
                CJUMP LT TEMP 36 8 L1
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
            10
        )
    END
END
    Size_4_Test_foo [ 1 ]
    BEGIN
        HSTORE TEMP 0 4
            BEGIN
                MOVE TEMP 40 HALLOCATE 8
                MOVE TEMP 41 HALLOCATE 4
                HSTORE TEMP 41 0 Size_4_Test_foo
                MOVE TEMP 42 4
                L2
                CJUMP LT TEMP 42 8 L3
                HSTORE PLUS TEMP 40 TEMP 42 0 0
                MOVE TEMP 42 PLUS TEMP 42 4
                JUMP L2
                L3
                HSTORE TEMP 40 0 TEMP 41
                RETURN TEMP 40
            END
        MOVE TEMP 43
        BEGIN
            RETURN TEMP 1
        END
        RETURN TEMP 43
    END
