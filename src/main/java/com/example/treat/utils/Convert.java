package com.example.treat.utils;

import com.example.treat.daos.Listen;
import com.example.treat.daos.Read;
import com.example.treat.daos.Write;
import com.example.treat.dtos.ListenDTO;
import com.example.treat.dtos.ReadDTO;
import com.example.treat.dtos.WriteDTO;

public class Convert {
    public static Listen fromListenDTOToListen(ListenDTO listenDTO, Listen listen){
        if (listenDTO.getValue() != null){
            listen.setValue(listenDTO.getValue());
        }
        return listen;
    }
    public static Read fromReadDTOToRead(ReadDTO readDTO, Read read){
        if (readDTO.getValue() != null){
            read.setValue(readDTO.getValue());
        }
        return read;
    }
    public static Write fromWriteDTOToWrite(WriteDTO writeDTO, Write write){
        if (writeDTO.getValue() != null){
            write.setValue(writeDTO.getValue());
        }
        return write;
    }
}
