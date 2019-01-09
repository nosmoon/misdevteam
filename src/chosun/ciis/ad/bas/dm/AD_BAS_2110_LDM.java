/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ��ȣ��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ad.bas.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.driver.OracleTypes;
import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_BAS_2110_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String slcrg_pers;
	public String cmpy_nm;
	public String cur_job;
	public String flnm;
	public String cust_mang_item;

	public AD_BAS_2110_LDM(){}
	public AD_BAS_2110_LDM(String cmpy_cd, String slcrg_pers, String cmpy_nm, String cur_job, String flnm, String cust_mang_item){
		this.cmpy_cd = cmpy_cd;
		this.slcrg_pers = slcrg_pers;
		this.cmpy_nm = cmpy_nm;
		this.cur_job = cur_job;
		this.flnm = flnm;
		this.cust_mang_item = cust_mang_item;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setCmpy_nm(String cmpy_nm){
		this.cmpy_nm = cmpy_nm;
	}

	public void setCur_job(String cur_job){
		this.cur_job = cur_job;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setCust_mang_item(String cust_mang_item){
		this.cust_mang_item = cust_mang_item;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getCmpy_nm(){
		return this.cmpy_nm;
	}

	public String getCur_job(){
		return this.cur_job;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getCust_mang_item(){
		return this.cust_mang_item;
	}

	public String getSQL(){
		 return "{ call SP_AD_BAS_2110_L( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_2110_LDM dm = (AD_BAS_2110_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.slcrg_pers);
		cstmt.setString(5, dm.cmpy_nm);
		cstmt.setString(6, dm.cur_job);
		cstmt.setString(7, dm.flnm);
		cstmt.setString(8, dm.cust_mang_item);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_2110_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("slcrg_pers = " + getSlcrg_pers());
        System.out.println("cmpy_nm = " + getCmpy_nm());
        System.out.println("cur_job = " + getCur_job());
        System.out.println("flnm = " + getFlnm());
        System.out.println("cust_mang_item = " + getCust_mang_item());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String slcrg_pers = req.getParameter("slcrg_pers");
if( slcrg_pers == null){
	System.out.println(this.toString+" : slcrg_pers is null" );
}else{
	System.out.println(this.toString+" : slcrg_pers is "+slcrg_pers );
}
String cmpy_nm = req.getParameter("cmpy_nm");
if( cmpy_nm == null){
	System.out.println(this.toString+" : cmpy_nm is null" );
}else{
	System.out.println(this.toString+" : cmpy_nm is "+cmpy_nm );
}
String cur_job = req.getParameter("cur_job");
if( cur_job == null){
	System.out.println(this.toString+" : cur_job is null" );
}else{
	System.out.println(this.toString+" : cur_job is "+cur_job );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String cust_mang_item = req.getParameter("cust_mang_item");
if( cust_mang_item == null){
	System.out.println(this.toString+" : cust_mang_item is null" );
}else{
	System.out.println(this.toString+" : cust_mang_item is "+cust_mang_item );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
String cmpy_nm = Util.checkString(req.getParameter("cmpy_nm"));
String cur_job = Util.checkString(req.getParameter("cur_job"));
String flnm = Util.checkString(req.getParameter("flnm"));
String cust_mang_item = Util.checkString(req.getParameter("cust_mang_item"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slcrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers")));
String cmpy_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_nm")));
String cur_job = Util.Uni2Ksc(Util.checkString(req.getParameter("cur_job")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String cust_mang_item = Util.Uni2Ksc(Util.checkString(req.getParameter("cust_mang_item")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setSlcrg_pers(slcrg_pers);
dm.setCmpy_nm(cmpy_nm);
dm.setCur_job(cur_job);
dm.setFlnm(flnm);
dm.setCust_mang_item(cust_mang_item);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jan 30 12:44:39 KST 2009 */