/***************************************************************************************************
* 파일명 : SL_A_CLAMTRDRRSLTCURRecord.java
* 기능 : 공통-입금내역정보저장
* 작성일자 : 2004-08-10
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sal.common.rec;

import java.sql.*;
import chosun.ciis.ss.sal.common.dm.*;
import chosun.ciis.ss.sal.common.ds.*;

/**
 * 공통-입금내역정보저장
 *
 */

public class SL_A_CLAMTRDRRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

    public String rdrno;
    public String dlvdstccd;
    public String dlvno;
    public String rdr_nm;
    public String medicd;
    public String medinm;
    public int dlvqty;
    public int realsubsamt;
    public String subsmappli;
    public String rcpmclsfcd;
    public String rcpmclsfnm;
    public String clamtmthdcd;
    public String clamtmthdnm;
    public int clamamt;
    public int clamt;

    public SL_A_CLAMTRDRRSLTCURRecord(){}

    public void setRdrno(String rdrno){
        this.rdrno = rdrno;
    }

    public void setDlvdstccd(String dlvdstccd){
        this.dlvdstccd = dlvdstccd;
    }

    public void setDlvno(String dlvno){
        this.dlvno = dlvno;
    }

    public void setRdr_nm(String rdr_nm){
        this.rdr_nm = rdr_nm;
    }

    public void setMedicd(String medicd){
        this.medicd = medicd;
    }

    public void setMedinm(String medinm){
        this.medinm = medinm;
    }

    public void setDlvqty(int dlvqty){
        this.dlvqty = dlvqty;
    }

    public void setRealsubsamt(int realsubsamt){
        this.realsubsamt = realsubsamt;
    }

    public void setSubsmappli(String subsmappli){
        this.subsmappli = subsmappli;
    }

    public void setRcpmclsfcd(String rcpmclsfcd){
        this.rcpmclsfcd = rcpmclsfcd;
    }

    public void setRcpmclsfnm(String rcpmclsfnm){
        this.rcpmclsfnm = rcpmclsfnm;
    }

    public void setClamtmthdcd(String clamtmthdcd){
        this.clamtmthdcd = clamtmthdcd;
    }

    public void setClamtmthdnm(String clamtmthdnm){
        this.clamtmthdnm = clamtmthdnm;
    }

    public void setClamamt(int clamamt){
        this.clamamt = clamamt;
    }

    public void setClamt(int clamt){
        this.clamt = clamt;
    }

    public String getRdrno(){
        return this.rdrno;
    }

    public String getDlvdstccd(){
        return this.dlvdstccd;
    }

    public String getDlvno(){
        return this.dlvno;
    }

    public String getRdr_nm(){
        return this.rdr_nm;
    }

    public String getMedicd(){
        return this.medicd;
    }

    public String getMedinm(){
        return this.medinm;
    }

    public int getDlvqty(){
        return this.dlvqty;
    }

    public int getRealsubsamt(){
        return this.realsubsamt;
    }

    public String getSubsmappli(){
        return this.subsmappli;
    }

    public String getRcpmclsfcd(){
        return this.rcpmclsfcd;
    }

    public String getRcpmclsfnm(){
        return this.rcpmclsfnm;
    }

    public String getClamtmthdcd(){
        return this.clamtmthdcd;
    }

    public String getClamtmthdnm(){
        return this.clamtmthdnm;
    }

    public int getClamamt(){
        return this.clamamt;
    }

    public int getClamt(){
        return this.clamt;
    }
}

/* 작성시간 : Wed Aug 11 01:38:44 KST 2004 */