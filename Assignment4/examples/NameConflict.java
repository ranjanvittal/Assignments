MAIN
    PRINT 
    BEGIN
        MOVE TEMP 35
            BEGIN
                MOVE TEMP 37 HALLOCATE 4
                MOVE TEMP 38 HALLOCATE 4
                HSTORE TEMP 38 0 Size_4_Test_foo
                MOVE TEMP 39 4
                L0
                CJUMP LT TEMP 39 4 L1
                HSTORE PLUS TEMP 37 TEMP 39 0 0
                MOVE TEMP 39 PLUS TEMP 39 4
                JUMP L0
                L1
                HSTORE TEMP 37 0 TEMP 38
                RETURN TEMP 37
            END
        HLOAD TEMP 40 TEMP 35 0
        HLOAD TEMP 41 TEMP 40 0
        RETURN
        CALL TEMP 41
        (
            TEMP 35
        )
    END
END
    Size_6_Parent_f1 [ 0 ]
    BEGIN
        MOVE TEMP 31
            0
        MOVE TEMP 42
        BEGIN
            RETURN TEMP 31
        END
        RETURN TEMP 42
    END
    Size_6_Parent_fn [ 0 ]
    BEGIN
        MOVE TEMP 43
        BEGIN
            HLOAD TEMP 44 TEMP 0 4
            RETURN TEMP 44
        END
        RETURN TEMP 43
    END
    Size_5_Child_f1 [ 0 ]
    BEGIN
        MOVE TEMP 45
        BEGIN
            HLOAD TEMP 46 TEMP 0 8
            RETURN TEMP 46
        END
        RETURN TEMP 45
    END
    Size_5_Child_fn [ 0 ]
    BEGIN
        MOVE TEMP 47
        BEGIN
            HLOAD TEMP 48 TEMP 0 12
            RETURN TEMP 48
        END
        RETURN TEMP 47
    END
    Size_4_Test_foo [ 0 ]
    BEGIN
        MOVE TEMP 33
            BEGIN
                MOVE TEMP 50 HALLOCATE 16
                MOVE TEMP 51 HALLOCATE 8
                HSTORE TEMP 51 0 Size_5_Child_f1
                HSTORE TEMP 51 4 Size_5_Child_fn
                MOVE TEMP 52 4
                L2
                CJUMP LT TEMP 52 16 L3
                HSTORE PLUS TEMP 50 TEMP 52 0 0
                MOVE TEMP 52 PLUS TEMP 52 4
                JUMP L2
                L3
                HSTORE TEMP 50 0 TEMP 51
                RETURN TEMP 50
            END
        MOVE TEMP 34
            BEGIN
                MOVE TEMP 53
                    BEGIN
                        RETURN TEMP 33
                    END
                HLOAD TEMP 54 TEMP 53 0
                HLOAD TEMP 55 TEMP 54 0
                RETURN
                CALL TEMP 55
                (
                    TEMP 53
                )
            END
        MOVE TEMP 56
        4
        RETURN TEMP 56
    END
