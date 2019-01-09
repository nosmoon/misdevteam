/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.mt.commatr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.commatr.ds.*;
import chosun.ciis.mt.commatr.rec.*;

/**
 * 
 */


public class MT_COMMATR_7110_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String search_dt_fr;
	public String search_dt_to;
	public String fac_clsf;
	public String list_gbn;
	public String gbn_data;
	public String gs_gbn;
	public String submatr_gbn;
	
	public MT_COMMATR_7110_LDM(){}
	public MT_COMMATR_7110_LDM(String cmpy_cd, String search_dt_fr, String search_dt_to, String fac_clsf, String list_gbn, String gbn_data, String gs_gbn, String submatr_gbn){
		this.cmpy_cd = cmpy_cd;
		this.search_dt_fr = search_dt_fr;
		this.search_dt_to = search_dt_to;
		this.fac_clsf = fac_clsf;
		this.list_gbn = list_gbn;
		this.gbn_data = gbn_data;
		this.gs_gbn = gs_gbn;
		this.submatr_gbn = submatr_gbn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSearch_dt_fr(String search_dt_fr){
		this.search_dt_fr = search_dt_fr;
	}

	public void setSearch_dt_to(String search_dt_to){
		this.search_dt_to = search_dt_to;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setList_gbn(String list_gbn){
		this.list_gbn = list_gbn;
	}

	public void setGbn_data(String gbn_data){
		this.gbn_data = gbn_data;
	}
	
	public void setGs_gbn(String gs_gbn){
		this.gs_gbn = gs_gbn;
	}
	
	public void setSubmatr_gbn(String submatr_gbn){
		this.submatr_gbn = submatr_gbn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSearch_dt_fr(){
		return this.search_dt_fr;
	}

	public String getSearch_dt_to(){
		return this.search_dt_to;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getList_gbn(){
		return this.list_gbn;
	}

	public String getGbn_data(){
		return this.gbn_data;
	}

	public String getGs_gbn(){
		return this.gs_gbn;
	}

	public String getSubmatr_gbn(){
		return this.submatr_gbn;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_COMMATR_7110_L(? ,?  ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_COMMATR_7110_LDM dm = (MT_COMMATR_7110_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.search_dt_fr);
		cstmt.setString(5, dm.search_dt_to);
		cstmt.setString(6, dm.fac_clsf);
		cstmt.setString(7, dm.list_gbn);
		cstmt.setString(8, dm.gbn_data);
		cstmt.setString(9, dm.gs_gbn);
		cstmt.setString(10, dm.submatr_gbn);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.commatr.ds.MT_COMMATR_7110_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("search_dt_fr = [" + getSearch_dt_fr() + "]");
		System.out.println("search_dt_to = [" + getSearch_dt_to() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("list_gbn = [" + getList_gbn() + "]");
		System.out.println("gbn_data = [" + getGbn_data() + "]");
		System.out.println("gs_gbn = [" + getGs_gbn() + "]");
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
String search_dt_fr = req.getParameter("search_dt_fr");
if( search_dt_fr == null){
	System.out.println(this.toString+" : search_dt_fr is null" );
}else{
	System.out.println(this.toString+" : search_dt_fr is "+search_dt_fr );
}
String search_dt_to = req.getParameter("search_dt_to");
if( search_dt_to == null){
	System.out.println(this.toString+" : search_dt_to is null" );
}else{
	System.out.println(this.toString+" : search_dt_to is "+search_dt_to );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String list_gbn = req.getParameter("list_gbn");
if( list_gbn == null){
	System.out.println(this.toString+" : list_gbn is null" );
}else{
	System.out.println(this.toString+" : list_gbn is "+list_gbn );
}
String gbn_data = req.getParameter("gbn_data");
if( gbn_data == null){
	System.out.println(this.toString+" : gbn_data is null" );
}else{
	System.out.println(this.toString+" : gbn_data is "+gbn_data );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String search_dt_fr = Util.checkString(req.getParameter("search_dt_fr"));
String search_dt_to = Util.checkString(req.getParameter("search_dt_to"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String list_gbn = Util.checkString(req.getParameter("list_gbn"));
String gbn_data = Util.checkString(req.getParameter("gbn_data"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String search_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("search_dt_fr")));
String search_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("search_dt_to")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String list_gbn = Util.Uni2Ksc(Util.checkString(req.getParameter("list_gbn")));
String gbn_data = Util.Uni2Ksc(Util.checkString(req.getParameter("gbn_data")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setSearch_dt_fr(search_dt_fr);
dm.setSearch_dt_to(search_dt_to);
dm.setFac_clsf(fac_clsf);
dm.setList_gbn(list_gbn);
dm.setGbn_data(gbn_data);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Dec 26 15:23:27 KST 2012 */