/***************************************************************************************************
* 파일명 : SS_L_PYMT_CLAMTRSLTCURRecord.java
* 기능 : 지국업무지원-Billing자동이체-납부자관리-수금내역조회
* 작성일자 : 2004-04-12
* 작성자 : 김상열
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 지국업무지원-Billing자동이체-납부자관리-수금내역조회
 *
 */


public class SS_L_PYMT_CLAMTRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

    public String rdr_no;
    public String medicd;
    public String subsmappli;
    public String clamtmthdnm;
    public String rcpmclsfnm;
    public String recpdt;
    public String shftdt;
    public int clamt;
    public int dlvqty;
    public int realsubsamt;

    public SS_L_PYMT_CLAMTRSLTCURRecord(){}

    public void setRdr_no(String rdr_no){
        this.rdr_no = rdr_no;
    }

    public void setMedicd(String medicd){
        this.medicd = medicd;
    }

    public void setSubsmappli(String subsmappli){
        this.subsmappli = subsmappli;
    }

    public void setClamtmthdnm(String clamtmthdnm){
        this.clamtmthdnm = clamtmthdnm;
    }

    public void setRcpmclsfnm(String rcpmclsfnm){
        this.rcpmclsfnm = rcpmclsfnm;
    }

    public void setRecpdt(String recpdt){
        this.recpdt = recpdt;
    }

    public void setShftdt(String shftdt){
        this.shftdt = shftdt;
    }

    public void setClamt(int clamt){
        this.clamt = clamt;
    }

    public void setDlvqty(int dlvqty){
        this.dlvqty = dlvqty;
    }

    public void setRealsubsamt(int realsubsamt){
        this.realsubsamt = realsubsamt;
    }

    public String getRdr_no(){
        return this.rdr_no;
    }

    public String getMedicd(){
        return this.medicd;
    }

    public String getSubsmappli(){
        return this.subsmappli;
    }

    public String getClamtmthdnm(){
        return this.clamtmthdnm;
    }

    public String getRcpmclsfnm(){
        return this.rcpmclsfnm;
    }

    public String getRecpdt(){
        return this.recpdt;
    }

    public String getShftdt(){
        return this.shftdt;
    }

    public int getClamt(){
        return this.clamt;
    }

    public int getDlvqty(){
        return this.dlvqty;
    }

    public int getRealsubsamt(){
        return this.realsubsamt;
    }
}

/* 작성시간 : Mon Apr 12 10:43:35 KST 2004 */