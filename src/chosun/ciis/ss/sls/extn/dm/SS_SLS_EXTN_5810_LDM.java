package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */

 
public class SS_SLS_EXTN_5810_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String fromdt;
	public String todt;
	public String rdrgb;
	public String prodgb;
	public String dlvct;
	public String dlvstat;
	public String pay_mthd;
	public String pay_gb;
	public String errgb;
	public String rcvr_nm;

	public SS_SLS_EXTN_5810_LDM(){}
	public SS_SLS_EXTN_5810_LDM(String deptcd, String partcd, String areacd, String bocd, String fromdt, String todt, String rdrgb, String prodgb, String dlvct, String dlvstat, String pay_mthd, String pay_gb, String errgb, String rcvr_nm){
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.fromdt = fromdt;
		this.todt = todt;
		this.rdrgb = rdrgb;
		this.prodgb = prodgb;
		this.dlvct = dlvct;
		this.dlvstat = dlvstat;
		this.pay_mthd = pay_mthd;
		this.pay_gb = pay_gb;
		this.errgb = errgb;
		this.rcvr_nm = rcvr_nm;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setPartcd(String partcd){
		this.partcd = partcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setFromdt(String fromdt){
		this.fromdt = fromdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setRdrgb(String rdrgb){
		this.rdrgb = rdrgb;
	}

	public void setProdgb(String prodgb){
		this.prodgb = prodgb;
	}

	public void setDlvct(String dlvct){
		this.dlvct = dlvct;
	}

	public void setDlvstat(String dlvstat){
		this.dlvstat = dlvstat;
	}

	public void setPay_mthd(String pay_mthd){
		this.pay_mthd = pay_mthd;
	}

	public void setPay_gb(String pay_gb){
		this.pay_gb = pay_gb;
	}

	public void setErrgb(String errgb){
		this.errgb = errgb;
	}
	
	public void setRcvr_nm(String rcvr_nm){
		this.rcvr_nm = rcvr_nm;
	}


	public String getDeptcd(){
		return this.deptcd;
	}

	public String getPartcd(){
		return this.partcd;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getFromdt(){
		return this.fromdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getRdrgb(){
		return this.rdrgb;
	}

	public String getProdgb(){
		return this.prodgb;
	}

	public String getDlvct(){
		return this.dlvct;
	}

	public String getDlvstat(){
		return this.dlvstat;
	}

	public String getPay_mthd(){
		return this.pay_mthd;
	}

	public String getPay_gb(){
		return this.pay_gb;
	}

	public String getErrgb(){
		return this.errgb;
	}
	
	public String getRcvr_nm(){
		return this.rcvr_nm;
	}

	public String getSQL(){
		 return "{ call SP_SS_SLS_EXTN_5810_L( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_EXTN_5810_LDM dm = (SS_SLS_EXTN_5810_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.partcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.fromdt);
		cstmt.setString(8, dm.todt);
		cstmt.setString(9, dm.rdrgb);
		cstmt.setString(10, dm.prodgb);
		cstmt.setString(11, dm.dlvct);
		cstmt.setString(12, dm.dlvstat);
		cstmt.setString(13, dm.pay_mthd);
		cstmt.setString(14, dm.pay_gb);
		cstmt.setString(15, dm.errgb);
		cstmt.setString(16, dm.rcvr_nm);
		cstmt.registerOutParameter(17, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_SLS_EXTN_5810_LDataSet();
	}

    public void print(){
        System.out.println("deptcd = " + getDeptcd());
        System.out.println("partcd = " + getPartcd());
        System.out.println("areacd = " + getAreacd());
        System.out.println("bocd = " + getBocd());
        System.out.println("fromdt = " + getFromdt());
        System.out.println("todt = " + getTodt());
        System.out.println("rdrgb = " + getRdrgb());
        System.out.println("prodgb = " + getProdgb());
        System.out.println("dlvct = " + getDlvct());
        System.out.println("dlvstat = " + getDlvstat());
        System.out.println("pay_mthd = " + getPay_mthd());
        System.out.println("pay_gb = " + getPay_gb());
        System.out.println("errgb = " + getErrgb());
        System.out.println("rcvr_nm = " + getRcvr_nm());
    }
}
