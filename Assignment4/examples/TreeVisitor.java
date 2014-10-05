MAIN
    PRINT 
    BEGIN
        MOVE TEMP 64
            BEGIN
                MOVE TEMP 66 HALLOCATE 4
                MOVE TEMP 67 HALLOCATE 4
                HSTORE TEMP 67 0 Size_2_TV_Start
                MOVE TEMP 68 4
                L0
                CJUMP LT TEMP 68 4 L1
                HSTORE PLUS TEMP 66 TEMP 68 0 0
                MOVE TEMP 68 PLUS TEMP 68 4
                JUMP L0
                L1
                HSTORE TEMP 66 0 TEMP 67
                RETURN TEMP 66
            END
        HLOAD TEMP 69 TEMP 64 0
        HLOAD TEMP 70 TEMP 69 0
        RETURN
        CALL TEMP 70
        (
            TEMP 64
        )
    END
END
    Size_2_TV_Start [ 0 ]
    BEGIN
        MOVE TEMP 62
            BEGIN
                MOVE TEMP 72 HALLOCATE 28
                MOVE TEMP 73 HALLOCATE 84
                HSTORE TEMP 73 0 Size_4_Tree_GetRight
                HSTORE TEMP 73 4 Size_4_Tree_GetLeft
                HSTORE TEMP 73 8 Size_4_Tree_Search
                HSTORE TEMP 73 12 Size_4_Tree_RemoveRight
                HSTORE TEMP 73 16 Size_4_Tree_Insert
                HSTORE TEMP 73 20 Size_4_Tree_accept
                HSTORE TEMP 73 24 Size_4_Tree_SetLeft
                HSTORE TEMP 73 28 Size_4_Tree_Compare
                HSTORE TEMP 73 32 Size_4_Tree_Print
                HSTORE TEMP 73 36 Size_4_Tree_GetHas_Left
                HSTORE TEMP 73 40 Size_4_Tree_RemoveLeft
                HSTORE TEMP 73 44 Size_4_Tree_SetHas_Left
                HSTORE TEMP 73 48 Size_4_Tree_GetHas_Right
                HSTORE TEMP 73 52 Size_4_Tree_GetKey
                HSTORE TEMP 73 56 Size_4_Tree_Init
                HSTORE TEMP 73 60 Size_4_Tree_SetKey
                HSTORE TEMP 73 64 Size_4_Tree_RecPrint
                HSTORE TEMP 73 68 Size_4_Tree_Remove
                HSTORE TEMP 73 72 Size_4_Tree_Delete
                HSTORE TEMP 73 76 Size_4_Tree_SetRight
                HSTORE TEMP 73 80 Size_4_Tree_SetHas_Right
                MOVE TEMP 74 4
                L2
                CJUMP LT TEMP 74 28 L3
                HSTORE PLUS TEMP 72 TEMP 74 0 0
                MOVE TEMP 74 PLUS TEMP 74 4
                JUMP L2
                L3
                HSTORE TEMP 72 0 TEMP 73
                RETURN TEMP 72
            END
        MOVE TEMP 61
            BEGIN
                MOVE TEMP 75
                    BEGIN
                        RETURN TEMP 62
                    END
                HLOAD TEMP 76 TEMP 75 0
                HLOAD TEMP 77 TEMP 76 56
                RETURN
                CALL TEMP 77
                (
                    TEMP 75
                    16
                )
            END
        MOVE TEMP 61
            BEGIN
                MOVE TEMP 78
                    BEGIN
                        RETURN TEMP 62
                    END
                HLOAD TEMP 79 TEMP 78 0
                HLOAD TEMP 80 TEMP 79 32
                RETURN
                CALL TEMP 80
                (
                    TEMP 78
                )
            END
        PRINT 
        100000000
        MOVE TEMP 61
            BEGIN
                MOVE TEMP 81
                    BEGIN
                        RETURN TEMP 62
                    END
                HLOAD TEMP 82 TEMP 81 0
                HLOAD TEMP 83 TEMP 82 16
                RETURN
                CALL TEMP 83
                (
                    TEMP 81
                    8
                )
            END
        MOVE TEMP 61
            BEGIN
                MOVE TEMP 84
                    BEGIN
                        RETURN TEMP 62
                    END
                HLOAD TEMP 85 TEMP 84 0
                HLOAD TEMP 86 TEMP 85 16
                RETURN
                CALL TEMP 86
                (
                    TEMP 84
                    24
                )
            END
        MOVE TEMP 61
            BEGIN
                MOVE TEMP 87
                    BEGIN
                        RETURN TEMP 62
                    END
                HLOAD TEMP 88 TEMP 87 0
                HLOAD TEMP 89 TEMP 88 16
                RETURN
                CALL TEMP 89
                (
                    TEMP 87
                    4
                )
            END
        MOVE TEMP 61
            BEGIN
                MOVE TEMP 90
                    BEGIN
                        RETURN TEMP 62
                    END
                HLOAD TEMP 91 TEMP 90 0
                HLOAD TEMP 92 TEMP 91 16
                RETURN
                CALL TEMP 92
                (
                    TEMP 90
                    12
                )
            END
        MOVE TEMP 61
            BEGIN
                MOVE TEMP 93
                    BEGIN
                        RETURN TEMP 62
                    END
                HLOAD TEMP 94 TEMP 93 0
                HLOAD TEMP 95 TEMP 94 16
                RETURN
                CALL TEMP 95
                (
                    TEMP 93
                    20
                )
            END
        MOVE TEMP 61
            BEGIN
                MOVE TEMP 96
                    BEGIN
                        RETURN TEMP 62
                    END
                HLOAD TEMP 97 TEMP 96 0
                HLOAD TEMP 98 TEMP 97 16
                RETURN
                CALL TEMP 98
                (
                    TEMP 96
                    28
                )
            END
        MOVE TEMP 61
            BEGIN
                MOVE TEMP 99
                    BEGIN
                        RETURN TEMP 62
                    END
                HLOAD TEMP 100 TEMP 99 0
                HLOAD TEMP 101 TEMP 100 16
                RETURN
                CALL TEMP 101
                (
                    TEMP 99
                    14
                )
            END
        MOVE TEMP 61
            BEGIN
                MOVE TEMP 102
                    BEGIN
                        RETURN TEMP 62
                    END
                HLOAD TEMP 103 TEMP 102 0
                HLOAD TEMP 104 TEMP 103 32
                RETURN
                CALL TEMP 104
                (
                    TEMP 102
                )
            END
        PRINT 
        100000000
        MOVE TEMP 60
            BEGIN
                MOVE TEMP 106 HALLOCATE 12
                MOVE TEMP 107 HALLOCATE 4
                HSTORE TEMP 107 0 Size_9_MyVisitor_visit
                MOVE TEMP 108 4
                L4
                CJUMP LT TEMP 108 12 L5
                HSTORE PLUS TEMP 106 TEMP 108 0 0
                MOVE TEMP 108 PLUS TEMP 108 4
                JUMP L4
                L5
                HSTORE TEMP 106 0 TEMP 107
                RETURN TEMP 106
            END
        PRINT 
        50000000
        MOVE TEMP 63
            BEGIN
                MOVE TEMP 109
                    BEGIN
                        RETURN TEMP 62
                    END
                HLOAD TEMP 110 TEMP 109 0
                HLOAD TEMP 111 TEMP 110 20
                RETURN
                CALL TEMP 111
                (
                    TEMP 109
                    BEGIN
                        RETURN TEMP 60
                    END
                )
            END
        PRINT 
        100000000
        PRINT 
        BEGIN
            MOVE TEMP 112
                BEGIN
                    RETURN TEMP 62
                END
            HLOAD TEMP 113 TEMP 112 0
            HLOAD TEMP 114 TEMP 113 8
            RETURN
            CALL TEMP 114
            (
                TEMP 112
                24
            )
        END
        PRINT 
        BEGIN
            MOVE TEMP 115
                BEGIN
                    RETURN TEMP 62
                END
            HLOAD TEMP 116 TEMP 115 0
            HLOAD TEMP 117 TEMP 116 8
            RETURN
            CALL TEMP 117
            (
                TEMP 115
                12
            )
        END
        PRINT 
        BEGIN
            MOVE TEMP 118
                BEGIN
                    RETURN TEMP 62
                END
            HLOAD TEMP 119 TEMP 118 0
            HLOAD TEMP 120 TEMP 119 8
            RETURN
            CALL TEMP 120
            (
                TEMP 118
                16
            )
        END
        PRINT 
        BEGIN
            MOVE TEMP 121
                BEGIN
                    RETURN TEMP 62
                END
            HLOAD TEMP 122 TEMP 121 0
            HLOAD TEMP 123 TEMP 122 8
            RETURN
            CALL TEMP 123
            (
                TEMP 121
                50
            )
        END
        PRINT 
        BEGIN
            MOVE TEMP 124
                BEGIN
                    RETURN TEMP 62
                END
            HLOAD TEMP 125 TEMP 124 0
            HLOAD TEMP 126 TEMP 125 8
            RETURN
            CALL TEMP 126
            (
                TEMP 124
                12
            )
        END
        MOVE TEMP 61
            BEGIN
                MOVE TEMP 127
                    BEGIN
                        RETURN TEMP 62
                    END
                HLOAD TEMP 128 TEMP 127 0
                HLOAD TEMP 129 TEMP 128 72
                RETURN
                CALL TEMP 129
                (
                    TEMP 127
                    12
                )
            END
        MOVE TEMP 61
            BEGIN
                MOVE TEMP 130
                    BEGIN
                        RETURN TEMP 62
                    END
                HLOAD TEMP 131 TEMP 130 0
                HLOAD TEMP 132 TEMP 131 32
                RETURN
                CALL TEMP 132
                (
                    TEMP 130
                )
            END
        PRINT 
        BEGIN
            MOVE TEMP 133
                BEGIN
                    RETURN TEMP 62
                END
            HLOAD TEMP 134 TEMP 133 0
            HLOAD TEMP 135 TEMP 134 8
            RETURN
            CALL TEMP 135
            (
                TEMP 133
                12
            )
        END
        MOVE TEMP 136
        0
        RETURN TEMP 136
    END
    Size_4_Tree_Init [ 1 ]
    BEGIN
        HSTORE TEMP 0 24
            BEGIN
                RETURN TEMP 1
            END
        HSTORE TEMP 0 20
            0
        HSTORE TEMP 0 8
            0
        MOVE TEMP 137
        1
        RETURN TEMP 137
    END
    Size_4_Tree_SetRight [ 1 ]
    BEGIN
        HSTORE TEMP 0 16
            BEGIN
                RETURN TEMP 1
            END
        MOVE TEMP 138
        1
        RETURN TEMP 138
    END
    Size_4_Tree_SetLeft [ 1 ]
    BEGIN
        HSTORE TEMP 0 12
            BEGIN
                RETURN TEMP 1
            END
        MOVE TEMP 139
        1
        RETURN TEMP 139
    END
    Size_4_Tree_GetRight [ 0 ]
    BEGIN
        MOVE TEMP 140
        BEGIN
            HLOAD TEMP 141 TEMP 0 16
            RETURN TEMP 141
        END
        RETURN TEMP 140
    END
    Size_4_Tree_GetLeft [ 0 ]
    BEGIN
        MOVE TEMP 142
        BEGIN
            HLOAD TEMP 143 TEMP 0 12
            RETURN TEMP 143
        END
        RETURN TEMP 142
    END
    Size_4_Tree_GetKey [ 0 ]
    BEGIN
        MOVE TEMP 144
        BEGIN
            HLOAD TEMP 145 TEMP 0 24
            RETURN TEMP 145
        END
        RETURN TEMP 144
    END
    Size_4_Tree_SetKey [ 1 ]
    BEGIN
        HSTORE TEMP 0 24
            BEGIN
                RETURN TEMP 1
            END
        MOVE TEMP 146
        1
        RETURN TEMP 146
    END
    Size_4_Tree_GetHas_Right [ 0 ]
    BEGIN
        MOVE TEMP 147
        BEGIN
            HLOAD TEMP 148 TEMP 0 8
            RETURN TEMP 148
        END
        RETURN TEMP 147
    END
    Size_4_Tree_GetHas_Left [ 0 ]
    BEGIN
        MOVE TEMP 149
        BEGIN
            HLOAD TEMP 150 TEMP 0 20
            RETURN TEMP 150
        END
        RETURN TEMP 149
    END
    Size_4_Tree_SetHas_Left [ 1 ]
    BEGIN
        HSTORE TEMP 0 20
            BEGIN
                RETURN TEMP 1
            END
        MOVE TEMP 151
        1
        RETURN TEMP 151
    END
    Size_4_Tree_SetHas_Right [ 1 ]
    BEGIN
        HSTORE TEMP 0 8
            BEGIN
                RETURN TEMP 1
            END
        MOVE TEMP 152
        1
        RETURN TEMP 152
    END
    Size_4_Tree_Compare [ 2 ]
    BEGIN
        MOVE TEMP 43
            0
        MOVE TEMP 44
            PLUS
                BEGIN
                    RETURN TEMP 2
                END
                1
        CJUMP
            LT
                BEGIN
                    RETURN TEMP 1
                END
                BEGIN
                    RETURN TEMP 2
                END
            L6
            MOVE TEMP 43
                0
            JUMP L7
            L6 NOOP
            CJUMP
            MINUS 1 
                LT
                    BEGIN
                        RETURN TEMP 1
                    END
                    BEGIN
                        RETURN TEMP 44
                    END
                L8
                MOVE TEMP 43
                    0
                JUMP L9
                L8 NOOP
                MOVE TEMP 43
                    1
                L9
                NOOP
            L7
            NOOP
        MOVE TEMP 154
        BEGIN
            RETURN TEMP 43
        END
        RETURN TEMP 154
    END
    Size_4_Tree_Insert [ 1 ]
    BEGIN
        MOVE TEMP 38
            BEGIN
                MOVE TEMP 156 HALLOCATE 28
                MOVE TEMP 157 HALLOCATE 84
                HSTORE TEMP 157 0 Size_4_Tree_GetRight
                HSTORE TEMP 157 4 Size_4_Tree_GetLeft
                HSTORE TEMP 157 8 Size_4_Tree_Search
                HSTORE TEMP 157 12 Size_4_Tree_RemoveRight
                HSTORE TEMP 157 16 Size_4_Tree_Insert
                HSTORE TEMP 157 20 Size_4_Tree_accept
                HSTORE TEMP 157 24 Size_4_Tree_SetLeft
                HSTORE TEMP 157 28 Size_4_Tree_Compare
                HSTORE TEMP 157 32 Size_4_Tree_Print
                HSTORE TEMP 157 36 Size_4_Tree_GetHas_Left
                HSTORE TEMP 157 40 Size_4_Tree_RemoveLeft
                HSTORE TEMP 157 44 Size_4_Tree_SetHas_Left
                HSTORE TEMP 157 48 Size_4_Tree_GetHas_Right
                HSTORE TEMP 157 52 Size_4_Tree_GetKey
                HSTORE TEMP 157 56 Size_4_Tree_Init
                HSTORE TEMP 157 60 Size_4_Tree_SetKey
                HSTORE TEMP 157 64 Size_4_Tree_RecPrint
                HSTORE TEMP 157 68 Size_4_Tree_Remove
                HSTORE TEMP 157 72 Size_4_Tree_Delete
                HSTORE TEMP 157 76 Size_4_Tree_SetRight
                HSTORE TEMP 157 80 Size_4_Tree_SetHas_Right
                MOVE TEMP 158 4
                L10
                CJUMP LT TEMP 158 28 L11
                HSTORE PLUS TEMP 156 TEMP 158 0 0
                MOVE TEMP 158 PLUS TEMP 158 4
                JUMP L10
                L11
                HSTORE TEMP 156 0 TEMP 157
                RETURN TEMP 156
            END
        MOVE TEMP 37
            BEGIN
                MOVE TEMP 159
                    BEGIN
                        RETURN TEMP 38
                    END
                HLOAD TEMP 160 TEMP 159 0
                HLOAD TEMP 161 TEMP 160 56
                RETURN
                CALL TEMP 161
                (
                    TEMP 159
                    BEGIN
                        RETURN TEMP 1
                    END
                )
            END
        MOVE TEMP 41
            TEMP 0
        MOVE TEMP 40
            1
        L12
         CJUMP 
        BEGIN
            RETURN TEMP 40
        END
        L13
        MOVE TEMP 39
            BEGIN
                MOVE TEMP 162
                    BEGIN
                        RETURN TEMP 41
                    END
                HLOAD TEMP 163 TEMP 162 0
                HLOAD TEMP 164 TEMP 163 52
                RETURN
                CALL TEMP 164
                (
                    TEMP 162
                )
            END
        CJUMP
            LT
                BEGIN
                    RETURN TEMP 1
                END
                BEGIN
                    RETURN TEMP 39
                END
            L14
            CJUMP
                BEGIN
                    MOVE TEMP 165
                        BEGIN
                            RETURN TEMP 41
                        END
                    HLOAD TEMP 166 TEMP 165 0
                    HLOAD TEMP 167 TEMP 166 36
                    RETURN
                    CALL TEMP 167
                    (
                        TEMP 165
                    )
                END
                L16
                MOVE TEMP 41
                    BEGIN
                        MOVE TEMP 168
                            BEGIN
                                RETURN TEMP 41
                            END
                        HLOAD TEMP 169 TEMP 168 0
                        HLOAD TEMP 170 TEMP 169 4
                        RETURN
                        CALL TEMP 170
                        (
                            TEMP 168
                        )
                    END
                JUMP L17
                L16 NOOP
                MOVE TEMP 40
                    0
                MOVE TEMP 37
                    BEGIN
                        MOVE TEMP 171
                            BEGIN
                                RETURN TEMP 41
                            END
                        HLOAD TEMP 172 TEMP 171 0
                        HLOAD TEMP 173 TEMP 172 44
                        RETURN
                        CALL TEMP 173
                        (
                            TEMP 171
                            1
                        )
                    END
                MOVE TEMP 37
                    BEGIN
                        MOVE TEMP 174
                            BEGIN
                                RETURN TEMP 41
                            END
                        HLOAD TEMP 175 TEMP 174 0
                        HLOAD TEMP 176 TEMP 175 24
                        RETURN
                        CALL TEMP 176
                        (
                            TEMP 174
                            BEGIN
                                RETURN TEMP 38
                            END
                        )
                    END
                L17
                NOOP
            JUMP L15
            L14 NOOP
            CJUMP
                BEGIN
                    MOVE TEMP 177
                        BEGIN
                            RETURN TEMP 41
                        END
                    HLOAD TEMP 178 TEMP 177 0
                    HLOAD TEMP 179 TEMP 178 48
                    RETURN
                    CALL TEMP 179
                    (
                        TEMP 177
                    )
                END
                L18
                MOVE TEMP 41
                    BEGIN
                        MOVE TEMP 180
                            BEGIN
                                RETURN TEMP 41
                            END
                        HLOAD TEMP 181 TEMP 180 0
                        HLOAD TEMP 182 TEMP 181 0
                        RETURN
                        CALL TEMP 182
                        (
                            TEMP 180
                        )
                    END
                JUMP L19
                L18 NOOP
                MOVE TEMP 40
                    0
                MOVE TEMP 37
                    BEGIN
                        MOVE TEMP 183
                            BEGIN
                                RETURN TEMP 41
                            END
                        HLOAD TEMP 184 TEMP 183 0
                        HLOAD TEMP 185 TEMP 184 80
                        RETURN
                        CALL TEMP 185
                        (
                            TEMP 183
                            1
                        )
                    END
                MOVE TEMP 37
                    BEGIN
                        MOVE TEMP 186
                            BEGIN
                                RETURN TEMP 41
                            END
                        HLOAD TEMP 187 TEMP 186 0
                        HLOAD TEMP 188 TEMP 187 76
                        RETURN
                        CALL TEMP 188
                        (
                            TEMP 186
                            BEGIN
                                RETURN TEMP 38
                            END
                        )
                    END
                L19
                NOOP
            L15
            NOOP
        JUMP L12
        L13
        NOOP
        MOVE TEMP 189
        1
        RETURN TEMP 189
    END
    Size_4_Tree_Delete [ 1 ]
    BEGIN
        MOVE TEMP 58
            TEMP 0
        MOVE TEMP 53
            TEMP 0
        MOVE TEMP 56
            1
        MOVE TEMP 57
            0
        MOVE TEMP 52
            1
        L20
         CJUMP 
        BEGIN
            RETURN TEMP 56
        END
        L21
        MOVE TEMP 55
            BEGIN
                MOVE TEMP 190
                    BEGIN
                        RETURN TEMP 58
                    END
                HLOAD TEMP 191 TEMP 190 0
                HLOAD TEMP 192 TEMP 191 52
                RETURN
                CALL TEMP 192
                (
                    TEMP 190
                )
            END
        CJUMP
            LT
                BEGIN
                    RETURN TEMP 1
                END
                BEGIN
                    RETURN TEMP 55
                END
            L22
            CJUMP
                BEGIN
                    MOVE TEMP 193
                        BEGIN
                            RETURN TEMP 58
                        END
                    HLOAD TEMP 194 TEMP 193 0
                    HLOAD TEMP 195 TEMP 194 36
                    RETURN
                    CALL TEMP 195
                    (
                        TEMP 193
                    )
                END
                L24
                MOVE TEMP 53
                    BEGIN
                        RETURN TEMP 58
                    END
                MOVE TEMP 58
                    BEGIN
                        MOVE TEMP 196
                            BEGIN
                                RETURN TEMP 58
                            END
                        HLOAD TEMP 197 TEMP 196 0
                        HLOAD TEMP 198 TEMP 197 4
                        RETURN
                        CALL TEMP 198
                        (
                            TEMP 196
                        )
                    END
                JUMP L25
                L24 NOOP
                MOVE TEMP 56
                    0
                L25
                NOOP
            JUMP L23
            L22 NOOP
            CJUMP
                LT
                    BEGIN
                        RETURN TEMP 55
                    END
                    BEGIN
                        RETURN TEMP 1
                    END
                L26
                CJUMP
                    BEGIN
                        MOVE TEMP 199
                            BEGIN
                                RETURN TEMP 58
                            END
                        HLOAD TEMP 200 TEMP 199 0
                        HLOAD TEMP 201 TEMP 200 48
                        RETURN
                        CALL TEMP 201
                        (
                            TEMP 199
                        )
                    END
                    L28
                    MOVE TEMP 53
                        BEGIN
                            RETURN TEMP 58
                        END
                    MOVE TEMP 58
                        BEGIN
                            MOVE TEMP 202
                                BEGIN
                                    RETURN TEMP 58
                                END
                            HLOAD TEMP 203 TEMP 202 0
                            HLOAD TEMP 204 TEMP 203 0
                            RETURN
                            CALL TEMP 204
                            (
                                TEMP 202
                            )
                        END
                    JUMP L29
                    L28 NOOP
                    MOVE TEMP 56
                        0
                    L29
                    NOOP
                JUMP L27
                L26 NOOP
                CJUMP
                    BEGIN
                        RETURN TEMP 52
                    END
                    L30
                    CJUMP
                        TIMES
                        MINUS 1 
                            BEGIN
                                MOVE TEMP 205
                                    BEGIN
                                        RETURN TEMP 58
                                    END
                                HLOAD TEMP 206 TEMP 205 0
                                HLOAD TEMP 207 TEMP 206 48
                                RETURN
                                CALL TEMP 207
                                (
                                    TEMP 205
                                )
                            END
                        MINUS 1 
                            BEGIN
                                MOVE TEMP 209
                                    BEGIN
                                        RETURN TEMP 58
                                    END
                                HLOAD TEMP 210 TEMP 209 0
                                HLOAD TEMP 211 TEMP 210 36
                                RETURN
                                CALL TEMP 211
                                (
                                    TEMP 209
                                )
                            END
                        L32
                        MOVE TEMP 54
                            1
                        JUMP L33
                        L32 NOOP
                        MOVE TEMP 54
                            BEGIN
                                MOVE TEMP 213
                                    TEMP 0
                                HLOAD TEMP 214 TEMP 213 0
                                HLOAD TEMP 215 TEMP 214 68
                                RETURN
                                CALL TEMP 215
                                (
                                    TEMP 213
                                    BEGIN
                                        RETURN TEMP 53
                                    END
                                    BEGIN
                                        RETURN TEMP 58
                                    END
                                )
                            END
                        L33
                        NOOP
                    JUMP L31
                    L30 NOOP
                    MOVE TEMP 54
                        BEGIN
                            MOVE TEMP 216
                                TEMP 0
                            HLOAD TEMP 217 TEMP 216 0
                            HLOAD TEMP 218 TEMP 217 68
                            RETURN
                            CALL TEMP 218
                            (
                                TEMP 216
                                BEGIN
                                    RETURN TEMP 53
                                END
                                BEGIN
                                    RETURN TEMP 58
                                END
                            )
                        END
                    L31
                    NOOP
                MOVE TEMP 57
                    1
                MOVE TEMP 56
                    0
                L27
                NOOP
            L23
            NOOP
        MOVE TEMP 52
            0
        JUMP L20
        L21
        NOOP
        MOVE TEMP 219
        BEGIN
            RETURN TEMP 57
        END
        RETURN TEMP 219
    END
    Size_4_Tree_Remove [ 2 ]
    BEGIN
        CJUMP
            BEGIN
                MOVE TEMP 220
                    BEGIN
                        RETURN TEMP 2
                    END
                HLOAD TEMP 221 TEMP 220 0
                HLOAD TEMP 222 TEMP 221 36
                RETURN
                CALL TEMP 222
                (
                    TEMP 220
                )
            END
            L34
            MOVE TEMP 49
                BEGIN
                    MOVE TEMP 223
                        TEMP 0
                    HLOAD TEMP 224 TEMP 223 0
                    HLOAD TEMP 225 TEMP 224 40
                    RETURN
                    CALL TEMP 225
                    (
                        TEMP 223
                        BEGIN
                            RETURN TEMP 1
                        END
                        BEGIN
                            RETURN TEMP 2
                        END
                    )
                END
            JUMP L35
            L34 NOOP
            CJUMP
                BEGIN
                    MOVE TEMP 226
                        BEGIN
                            RETURN TEMP 2
                        END
                    HLOAD TEMP 227 TEMP 226 0
                    HLOAD TEMP 228 TEMP 227 48
                    RETURN
                    CALL TEMP 228
                    (
                        TEMP 226
                    )
                END
                L36
                MOVE TEMP 49
                    BEGIN
                        MOVE TEMP 229
                            TEMP 0
                        HLOAD TEMP 230 TEMP 229 0
                        HLOAD TEMP 231 TEMP 230 12
                        RETURN
                        CALL TEMP 231
                        (
                            TEMP 229
                            BEGIN
                                RETURN TEMP 1
                            END
                            BEGIN
                                RETURN TEMP 2
                            END
                        )
                    END
                JUMP L37
                L36 NOOP
                MOVE TEMP 50
                    BEGIN
                        MOVE TEMP 232
                            BEGIN
                                RETURN TEMP 2
                            END
                        HLOAD TEMP 233 TEMP 232 0
                        HLOAD TEMP 234 TEMP 233 52
                        RETURN
                        CALL TEMP 234
                        (
                            TEMP 232
                        )
                    END
                MOVE TEMP 51
                    BEGIN
                        MOVE TEMP 235
                            BEGIN
                                MOVE TEMP 236
                                    BEGIN
                                        RETURN TEMP 1
                                    END
                                HLOAD TEMP 237 TEMP 236 0
                                HLOAD TEMP 238 TEMP 237 4
                                RETURN
                                CALL TEMP 238
                                (
                                    TEMP 236
                                )
                            END
                        HLOAD TEMP 239 TEMP 235 0
                        HLOAD TEMP 240 TEMP 239 52
                        RETURN
                        CALL TEMP 240
                        (
                            TEMP 235
                        )
                    END
                CJUMP
                    BEGIN
                        MOVE TEMP 241
                            TEMP 0
                        HLOAD TEMP 242 TEMP 241 0
                        HLOAD TEMP 243 TEMP 242 28
                        RETURN
                        CALL TEMP 243
                        (
                            TEMP 241
                            BEGIN
                                RETURN TEMP 50
                            END
                            BEGIN
                                RETURN TEMP 51
                            END
                        )
                    END
                    L38
                    MOVE TEMP 49
                        BEGIN
                            MOVE TEMP 244
                                BEGIN
                                    RETURN TEMP 1
                                END
                            HLOAD TEMP 245 TEMP 244 0
                            HLOAD TEMP 246 TEMP 245 24
                            RETURN
                            CALL TEMP 246
                            (
                                TEMP 244
                                BEGIN
                                    HLOAD TEMP 247 TEMP 0 4
                                    RETURN TEMP 247
                                END
                            )
                        END
                    MOVE TEMP 49
                        BEGIN
                            MOVE TEMP 248
                                BEGIN
                                    RETURN TEMP 1
                                END
                            HLOAD TEMP 249 TEMP 248 0
                            HLOAD TEMP 250 TEMP 249 44
                            RETURN
                            CALL TEMP 250
                            (
                                TEMP 248
                                0
                            )
                        END
                    JUMP L39
                    L38 NOOP
                    MOVE TEMP 49
                        BEGIN
                            MOVE TEMP 251
                                BEGIN
                                    RETURN TEMP 1
                                END
                            HLOAD TEMP 252 TEMP 251 0
                            HLOAD TEMP 253 TEMP 252 76
                            RETURN
                            CALL TEMP 253
                            (
                                TEMP 251
                                BEGIN
                                    HLOAD TEMP 254 TEMP 0 4
                                    RETURN TEMP 254
                                END
                            )
                        END
                    MOVE TEMP 49
                        BEGIN
                            MOVE TEMP 255
                                BEGIN
                                    RETURN TEMP 1
                                END
                            HLOAD TEMP 256 TEMP 255 0
                            HLOAD TEMP 257 TEMP 256 80
                            RETURN
                            CALL TEMP 257
                            (
                                TEMP 255
                                0
                            )
                        END
                    L39
                    NOOP
                L37
                NOOP
            L35
            NOOP
        MOVE TEMP 258
        1
        RETURN TEMP 258
    END
    Size_4_Tree_RemoveRight [ 2 ]
    BEGIN
        L40
         CJUMP 
        BEGIN
            MOVE TEMP 259
                BEGIN
                    RETURN TEMP 2
                END
            HLOAD TEMP 260 TEMP 259 0
            HLOAD TEMP 261 TEMP 260 48
            RETURN
            CALL TEMP 261
            (
                TEMP 259
            )
        END
        L41
        MOVE TEMP 36
            BEGIN
                MOVE TEMP 262
                    BEGIN
                        RETURN TEMP 2
                    END
                HLOAD TEMP 263 TEMP 262 0
                HLOAD TEMP 264 TEMP 263 60
                RETURN
                CALL TEMP 264
                (
                    TEMP 262
                    BEGIN
                        MOVE TEMP 265
                            BEGIN
                                MOVE TEMP 266
                                    BEGIN
                                        RETURN TEMP 2
                                    END
                                HLOAD TEMP 267 TEMP 266 0
                                HLOAD TEMP 268 TEMP 267 0
                                RETURN
                                CALL TEMP 268
                                (
                                    TEMP 266
                                )
                            END
                        HLOAD TEMP 269 TEMP 265 0
                        HLOAD TEMP 270 TEMP 269 52
                        RETURN
                        CALL TEMP 270
                        (
                            TEMP 265
                        )
                    END
                )
            END
        MOVE TEMP 1
            BEGIN
                RETURN TEMP 2
            END
        MOVE TEMP 2
            BEGIN
                MOVE TEMP 271
                    BEGIN
                        RETURN TEMP 2
                    END
                HLOAD TEMP 272 TEMP 271 0
                HLOAD TEMP 273 TEMP 272 0
                RETURN
                CALL TEMP 273
                (
                    TEMP 271
                )
            END
        JUMP L40
        L41
        NOOP
        MOVE TEMP 36
            BEGIN
                MOVE TEMP 274
                    BEGIN
                        RETURN TEMP 1
                    END
                HLOAD TEMP 275 TEMP 274 0
                HLOAD TEMP 276 TEMP 275 76
                RETURN
                CALL TEMP 276
                (
                    TEMP 274
                    BEGIN
                        HLOAD TEMP 277 TEMP 0 4
                        RETURN TEMP 277
                    END
                )
            END
        MOVE TEMP 36
            BEGIN
                MOVE TEMP 278
                    BEGIN
                        RETURN TEMP 1
                    END
                HLOAD TEMP 279 TEMP 278 0
                HLOAD TEMP 280 TEMP 279 80
                RETURN
                CALL TEMP 280
                (
                    TEMP 278
                    0
                )
            END
        MOVE TEMP 281
        1
        RETURN TEMP 281
    END
    Size_4_Tree_RemoveLeft [ 2 ]
    BEGIN
        L42
         CJUMP 
        BEGIN
            MOVE TEMP 282
                BEGIN
                    RETURN TEMP 2
                END
            HLOAD TEMP 283 TEMP 282 0
            HLOAD TEMP 284 TEMP 283 36
            RETURN
            CALL TEMP 284
            (
                TEMP 282
            )
        END
        L43
        MOVE TEMP 47
            BEGIN
                MOVE TEMP 285
                    BEGIN
                        RETURN TEMP 2
                    END
                HLOAD TEMP 286 TEMP 285 0
                HLOAD TEMP 287 TEMP 286 60
                RETURN
                CALL TEMP 287
                (
                    TEMP 285
                    BEGIN
                        MOVE TEMP 288
                            BEGIN
                                MOVE TEMP 289
                                    BEGIN
                                        RETURN TEMP 2
                                    END
                                HLOAD TEMP 290 TEMP 289 0
                                HLOAD TEMP 291 TEMP 290 4
                                RETURN
                                CALL TEMP 291
                                (
                                    TEMP 289
                                )
                            END
                        HLOAD TEMP 292 TEMP 288 0
                        HLOAD TEMP 293 TEMP 292 52
                        RETURN
                        CALL TEMP 293
                        (
                            TEMP 288
                        )
                    END
                )
            END
        MOVE TEMP 1
            BEGIN
                RETURN TEMP 2
            END
        MOVE TEMP 2
            BEGIN
                MOVE TEMP 294
                    BEGIN
                        RETURN TEMP 2
                    END
                HLOAD TEMP 295 TEMP 294 0
                HLOAD TEMP 296 TEMP 295 4
                RETURN
                CALL TEMP 296
                (
                    TEMP 294
                )
            END
        JUMP L42
        L43
        NOOP
        MOVE TEMP 47
            BEGIN
                MOVE TEMP 297
                    BEGIN
                        RETURN TEMP 1
                    END
                HLOAD TEMP 298 TEMP 297 0
                HLOAD TEMP 299 TEMP 298 24
                RETURN
                CALL TEMP 299
                (
                    TEMP 297
                    BEGIN
                        HLOAD TEMP 300 TEMP 0 4
                        RETURN TEMP 300
                    END
                )
            END
        MOVE TEMP 47
            BEGIN
                MOVE TEMP 301
                    BEGIN
                        RETURN TEMP 1
                    END
                HLOAD TEMP 302 TEMP 301 0
                HLOAD TEMP 303 TEMP 302 44
                RETURN
                CALL TEMP 303
                (
                    TEMP 301
                    0
                )
            END
        MOVE TEMP 304
        1
        RETURN TEMP 304
    END
    Size_4_Tree_Search [ 1 ]
    BEGIN
        MOVE TEMP 35
            TEMP 0
        MOVE TEMP 34
            1
        MOVE TEMP 32
            0
        L44
         CJUMP 
        BEGIN
            RETURN TEMP 34
        END
        L45
        MOVE TEMP 33
            BEGIN
                MOVE TEMP 305
                    BEGIN
                        RETURN TEMP 35
                    END
                HLOAD TEMP 306 TEMP 305 0
                HLOAD TEMP 307 TEMP 306 52
                RETURN
                CALL TEMP 307
                (
                    TEMP 305
                )
            END
        CJUMP
            LT
                BEGIN
                    RETURN TEMP 1
                END
                BEGIN
                    RETURN TEMP 33
                END
            L46
            CJUMP
                BEGIN
                    MOVE TEMP 308
                        BEGIN
                            RETURN TEMP 35
                        END
                    HLOAD TEMP 309 TEMP 308 0
                    HLOAD TEMP 310 TEMP 309 36
                    RETURN
                    CALL TEMP 310
                    (
                        TEMP 308
                    )
                END
                L48
                MOVE TEMP 35
                    BEGIN
                        MOVE TEMP 311
                            BEGIN
                                RETURN TEMP 35
                            END
                        HLOAD TEMP 312 TEMP 311 0
                        HLOAD TEMP 313 TEMP 312 4
                        RETURN
                        CALL TEMP 313
                        (
                            TEMP 311
                        )
                    END
                JUMP L49
                L48 NOOP
                MOVE TEMP 34
                    0
                L49
                NOOP
            JUMP L47
            L46 NOOP
            CJUMP
                LT
                    BEGIN
                        RETURN TEMP 33
                    END
                    BEGIN
                        RETURN TEMP 1
                    END
                L50
                CJUMP
                    BEGIN
                        MOVE TEMP 314
                            BEGIN
                                RETURN TEMP 35
                            END
                        HLOAD TEMP 315 TEMP 314 0
                        HLOAD TEMP 316 TEMP 315 48
                        RETURN
                        CALL TEMP 316
                        (
                            TEMP 314
                        )
                    END
                    L52
                    MOVE TEMP 35
                        BEGIN
                            MOVE TEMP 317
                                BEGIN
                                    RETURN TEMP 35
                                END
                            HLOAD TEMP 318 TEMP 317 0
                            HLOAD TEMP 319 TEMP 318 0
                            RETURN
                            CALL TEMP 319
                            (
                                TEMP 317
                            )
                        END
                    JUMP L53
                    L52 NOOP
                    MOVE TEMP 34
                        0
                    L53
                    NOOP
                JUMP L51
                L50 NOOP
                MOVE TEMP 32
                    1
                MOVE TEMP 34
                    0
                L51
                NOOP
            L47
            NOOP
        JUMP L44
        L45
        NOOP
        MOVE TEMP 320
        BEGIN
            RETURN TEMP 32
        END
        RETURN TEMP 320
    END
    Size_4_Tree_Print [ 0 ]
    BEGIN
        MOVE TEMP 46
            TEMP 0
        MOVE TEMP 45
            BEGIN
                MOVE TEMP 321
                    TEMP 0
                HLOAD TEMP 322 TEMP 321 0
                HLOAD TEMP 323 TEMP 322 64
                RETURN
                CALL TEMP 323
                (
                    TEMP 321
                    BEGIN
                        RETURN TEMP 46
                    END
                )
            END
        MOVE TEMP 324
        1
        RETURN TEMP 324
    END
    Size_4_Tree_RecPrint [ 1 ]
    BEGIN
        CJUMP
            BEGIN
                MOVE TEMP 325
                    BEGIN
                        RETURN TEMP 1
                    END
                HLOAD TEMP 326 TEMP 325 0
                HLOAD TEMP 327 TEMP 326 36
                RETURN
                CALL TEMP 327
                (
                    TEMP 325
                )
            END
            L54
            MOVE TEMP 48
                BEGIN
                    MOVE TEMP 328
                        TEMP 0
                    HLOAD TEMP 329 TEMP 328 0
                    HLOAD TEMP 330 TEMP 329 64
                    RETURN
                    CALL TEMP 330
                    (
                        TEMP 328
                        BEGIN
                            MOVE TEMP 331
                                BEGIN
                                    RETURN TEMP 1
                                END
                            HLOAD TEMP 332 TEMP 331 0
                            HLOAD TEMP 333 TEMP 332 4
                            RETURN
                            CALL TEMP 333
                            (
                                TEMP 331
                            )
                        END
                    )
                END
            JUMP L55
            L54 NOOP
            MOVE TEMP 48
                1
            L55
            NOOP
        PRINT 
        BEGIN
            MOVE TEMP 334
                BEGIN
                    RETURN TEMP 1
                END
            HLOAD TEMP 335 TEMP 334 0
            HLOAD TEMP 336 TEMP 335 52
            RETURN
            CALL TEMP 336
            (
                TEMP 334
            )
        END
        CJUMP
            BEGIN
                MOVE TEMP 337
                    BEGIN
                        RETURN TEMP 1
                    END
                HLOAD TEMP 338 TEMP 337 0
                HLOAD TEMP 339 TEMP 338 48
                RETURN
                CALL TEMP 339
                (
                    TEMP 337
                )
            END
            L56
            MOVE TEMP 48
                BEGIN
                    MOVE TEMP 340
                        TEMP 0
                    HLOAD TEMP 341 TEMP 340 0
                    HLOAD TEMP 342 TEMP 341 64
                    RETURN
                    CALL TEMP 342
                    (
                        TEMP 340
                        BEGIN
                            MOVE TEMP 343
                                BEGIN
                                    RETURN TEMP 1
                                END
                            HLOAD TEMP 344 TEMP 343 0
                            HLOAD TEMP 345 TEMP 344 0
                            RETURN
                            CALL TEMP 345
                            (
                                TEMP 343
                            )
                        END
                    )
                END
            JUMP L57
            L56 NOOP
            MOVE TEMP 48
                1
            L57
            NOOP
        MOVE TEMP 346
        1
        RETURN TEMP 346
    END
    Size_4_Tree_accept [ 1 ]
    BEGIN
        PRINT 
        333
        MOVE TEMP 42
            BEGIN
                MOVE TEMP 347
                    BEGIN
                        RETURN TEMP 1
                    END
                HLOAD TEMP 348 TEMP 347 0
                HLOAD TEMP 349 TEMP 348 0
                RETURN
                CALL TEMP 349
                (
                    TEMP 347
                    TEMP 0
                )
            END
        MOVE TEMP 350
        0
        RETURN TEMP 350
    END
    Size_7_Visitor_visit [ 1 ]
    BEGIN
        CJUMP
            BEGIN
                MOVE TEMP 351
                    BEGIN
                        RETURN TEMP 1
                    END
                HLOAD TEMP 352 TEMP 351 0
                HLOAD TEMP 353 TEMP 352 48
                RETURN
                CALL TEMP 353
                (
                    TEMP 351
                )
            END
            L58
            HSTORE TEMP 0 4
                BEGIN
                    MOVE TEMP 354
                        BEGIN
                            RETURN TEMP 1
                        END
                    HLOAD TEMP 355 TEMP 354 0
                    HLOAD TEMP 356 TEMP 355 0
                    RETURN
                    CALL TEMP 356
                    (
                        TEMP 354
                    )
                END
            MOVE TEMP 31
                BEGIN
                    MOVE TEMP 357
                        BEGIN
                            HLOAD TEMP 358 TEMP 0 4
                            RETURN TEMP 358
                        END
                    HLOAD TEMP 359 TEMP 357 0
                    HLOAD TEMP 360 TEMP 359 20
                    RETURN
                    CALL TEMP 360
                    (
                        TEMP 357
                        TEMP 0
                    )
                END
            JUMP L59
            L58 NOOP
            MOVE TEMP 31
                0
            L59
            NOOP
        CJUMP
            BEGIN
                MOVE TEMP 361
                    BEGIN
                        RETURN TEMP 1
                    END
                HLOAD TEMP 362 TEMP 361 0
                HLOAD TEMP 363 TEMP 362 36
                RETURN
                CALL TEMP 363
                (
                    TEMP 361
                )
            END
            L60
            HSTORE TEMP 0 8
                BEGIN
                    MOVE TEMP 364
                        BEGIN
                            RETURN TEMP 1
                        END
                    HLOAD TEMP 365 TEMP 364 0
                    HLOAD TEMP 366 TEMP 365 4
                    RETURN
                    CALL TEMP 366
                    (
                        TEMP 364
                    )
                END
            MOVE TEMP 31
                BEGIN
                    MOVE TEMP 367
                        BEGIN
                            HLOAD TEMP 368 TEMP 0 8
                            RETURN TEMP 368
                        END
                    HLOAD TEMP 369 TEMP 367 0
                    HLOAD TEMP 370 TEMP 369 20
                    RETURN
                    CALL TEMP 370
                    (
                        TEMP 367
                        TEMP 0
                    )
                END
            JUMP L61
            L60 NOOP
            MOVE TEMP 31
                0
            L61
            NOOP
        MOVE TEMP 371
        0
        RETURN TEMP 371
    END
    Size_9_MyVisitor_visit [ 1 ]
    BEGIN
        CJUMP
            BEGIN
                MOVE TEMP 372
                    BEGIN
                        RETURN TEMP 1
                    END
                HLOAD TEMP 373 TEMP 372 0
                HLOAD TEMP 374 TEMP 373 48
                RETURN
                CALL TEMP 374
                (
                    TEMP 372
                )
            END
            L62
            HSTORE TEMP 0 4
                BEGIN
                    MOVE TEMP 375
                        BEGIN
                            RETURN TEMP 1
                        END
                    HLOAD TEMP 376 TEMP 375 0
                    HLOAD TEMP 377 TEMP 376 0
                    RETURN
                    CALL TEMP 377
                    (
                        TEMP 375
                    )
                END
            MOVE TEMP 59
                BEGIN
                    MOVE TEMP 378
                        BEGIN
                            HLOAD TEMP 379 TEMP 0 4
                            RETURN TEMP 379
                        END
                    HLOAD TEMP 380 TEMP 378 0
                    HLOAD TEMP 381 TEMP 380 20
                    RETURN
                    CALL TEMP 381
                    (
                        TEMP 378
                        TEMP 0
                    )
                END
            JUMP L63
            L62 NOOP
            MOVE TEMP 59
                0
            L63
            NOOP
        PRINT 
        BEGIN
            MOVE TEMP 382
                BEGIN
                    RETURN TEMP 1
                END
            HLOAD TEMP 383 TEMP 382 0
            HLOAD TEMP 384 TEMP 383 52
            RETURN
            CALL TEMP 384
            (
                TEMP 382
            )
        END
        CJUMP
            BEGIN
                MOVE TEMP 385
                    BEGIN
                        RETURN TEMP 1
                    END
                HLOAD TEMP 386 TEMP 385 0
                HLOAD TEMP 387 TEMP 386 36
                RETURN
                CALL TEMP 387
                (
                    TEMP 385
                )
            END
            L64
            HSTORE TEMP 0 8
                BEGIN
                    MOVE TEMP 388
                        BEGIN
                            RETURN TEMP 1
                        END
                    HLOAD TEMP 389 TEMP 388 0
                    HLOAD TEMP 390 TEMP 389 4
                    RETURN
                    CALL TEMP 390
                    (
                        TEMP 388
                    )
                END
            MOVE TEMP 59
                BEGIN
                    MOVE TEMP 391
                        BEGIN
                            HLOAD TEMP 392 TEMP 0 8
                            RETURN TEMP 392
                        END
                    HLOAD TEMP 393 TEMP 391 0
                    HLOAD TEMP 394 TEMP 393 20
                    RETURN
                    CALL TEMP 394
                    (
                        TEMP 391
                        TEMP 0
                    )
                END
            JUMP L65
            L64 NOOP
            MOVE TEMP 59
                0
            L65
            NOOP
        MOVE TEMP 395
        0
        RETURN TEMP 395
    END
