/***************************************************************************************************
* ���ϸ� : SS_L_SHFT_CLAM_OCOM2RSLTCURRecord.java
* ��� : ������������-Billing�ڵ���ü-û���������-�ڵ���üû�������ϰ˻�
* �ۼ����� : 2004-06-07
* �ۼ��� : ���
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * ������������-Billing�ڵ���ü-û���������-�ڵ���üû�������ϰ˻�
 *
 */


public class SS_L_SHFT_CLAM_OCOM2RSLTCURRecord extends java.lang.Object implements java.io.Serializable{

    public String basidt;
    public String shftclsfcd;
    public String shftclsfnm;
    public String rdr_no;
    public String medicd;
    public String medinm;
    public int clamqty;
    public String subsmappli;
    public int clamamt;
    public String erryn;
    public String recpocomcd;
    public String recpocomnm;
    public String rdrnm;

    public SS_L_SHFT_CLAM_OCOM2RSLTCURRecord(){}

    public void setBasidt(String basidt){
        this.basidt = basidt;
    }

    public void setShftclsfcd(String shftclsfcd){
        this.shftclsfcd = shftclsfcd;
    }

    public void setShftclsfnm(String shftclsfnm){
        this.shftclsfnm = shftclsfnm;
    }

    public void setRdr_no(String rdr_no){
        this.rdr_no = rdr_no;
    }

    public void setMedicd(String medicd){
        this.medicd = medicd;
    }

    public void setMedinm(String medinm){
        this.medinm = medinm;
    }

    public void setClamqty(int clamqty){
        this.clamqty = clamqty;
    }

    public void setSubsmappli(String subsmappli){
        this.subsmappli = subsmappli;
    }

    public void setClamamt(int clamamt){
        this.clamamt = clamamt;
    }

    public void setErryn(String erryn){
        this.erryn = erryn;
    }

    public void setRecpocomcd(String recpocomcd){
        this.recpocomcd = recpocomcd;
    }

    public void setRecpocomnm(String recpocomnm){
        this.recpocomnm = recpocomnm;
    }

    public void setRdrnm(String rdrnm){
        this.rdrnm = rdrnm;
    }

    public String getBasidt(){
        return this.basidt;
    }

    public String getShftclsfcd(){
        return this.shftclsfcd;
    }

    public String getShftclsfnm(){
        return this.shftclsfnm;
    }

    public String getRdr_no(){
        return this.rdr_no;
    }

    public String getMedicd(){
        return this.medicd;
    }

    public String getMedinm(){
        return this.medinm;
    }

    public int getClamqty(){
        return this.clamqty;
    }

    public String getSubsmappli(){
        return this.subsmappli;
    }

    public int getClamamt(){
        return this.clamamt;
    }

    public String getErryn(){
        return this.erryn;
    }

    public String getRecpocomcd(){
        return this.recpocomcd;
    }

    public String getRecpocomnm(){
        return this.recpocomnm;
    }

    public String getRdrnm(){
        return this.rdrnm;
    }
}

/* �ۼ��ð� : Wed Jun 09 21:17:24 KST 2004 */