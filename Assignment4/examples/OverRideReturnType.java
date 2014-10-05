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
            5
        )
    END
END
    Size_6_Parent_bar [ 0 ]
    BEGIN
        MOVE TEMP 38
        BEGIN
            MOVE TEMP 40 HALLOCATE 4
            MOVE TEMP 41 HALLOCATE 0
            MOVE TEMP 42 4
            L2
            CJUMP LT TEMP 42 4 L3
            HSTORE PLUS TEMP 40 TEMP 42 0 0
            MOVE TEMP 42 PLUS TEMP 42 4
            JUMP L2
            L3
            HSTORE TEMP 40 0 TEMP 41
            RETURN TEMP 40
        END
        RETURN TEMP 38
    END
    Size_5_Child_bar [ 0 ]
    BEGIN
        MOVE TEMP 43
        BEGIN
            MOVE TEMP 45 HALLOCATE 4
            MOVE TEMP 46 HALLOCATE 0
            MOVE TEMP 47 4
            L4
            CJUMP LT TEMP 47 4 L5
            HSTORE PLUS TEMP 45 TEMP 47 0 0
            MOVE TEMP 47 PLUS TEMP 47 4
            JUMP L4
            L5
            HSTORE TEMP 45 0 TEMP 46
            RETURN TEMP 45
        END
        RETURN TEMP 43
    END
    Size_4_Test_foo [ 1 ]
    BEGIN
        MOVE TEMP 48
        67
        RETURN TEMP 48
    END
