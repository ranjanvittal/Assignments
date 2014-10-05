MAIN
    PRINT 
    BEGIN
        MOVE TEMP 31
            BEGIN
                MOVE TEMP 33 HALLOCATE 20
                MOVE TEMP 34 HALLOCATE 4
                HSTORE TEMP 34 0 Size_4_Test_bar
                MOVE TEMP 35 4
                L0
                CJUMP LT TEMP 35 20 L1
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
            5
        )
    END
END
    Size_4_Test_bar [ 1 ]
    BEGIN
        HSTORE TEMP 0 8
            BEGIN
            MOVE TEMP 39
            BEGIN
                RETURN TEMP 1
            END
                MOVE TEMP 40 HALLOCATE TIMES 4 PLUS 1 TEMP 39
                HSTORE TEMP 40 0 TEMP 39
                MOVE TEMP 41 4
                L2
                CJUMP LT TEMP 41 TIMES 4 PLUS 1 TEMP 39 L3
                HSTORE PLUS TEMP 40 TEMP 41 0 0
                MOVE TEMP 41 PLUS TEMP 41 4
                JUMP L2
                L3 NOOP
                RETURN TEMP 40
            END
        HSTORE TEMP 0 12
            1
        HSTORE TEMP 0 4
            89
        HSTORE TEMP 0 16
            BEGIN
                MOVE TEMP 43 HALLOCATE 8
                MOVE TEMP 44 HALLOCATE 0
                MOVE TEMP 45 4
                L4
                CJUMP LT TEMP 45 8 L5
                HSTORE PLUS TEMP 43 TEMP 45 0 0
                MOVE TEMP 45 PLUS TEMP 45 4
                JUMP L4
                L5
                HSTORE TEMP 43 0 TEMP 44
                RETURN TEMP 43
            END
        MOVE TEMP 46
        0
        RETURN TEMP 46
    END
