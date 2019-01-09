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


package chosun.ciis.as.aset.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.aset.ds.*;
import chosun.ciis.as.aset.rec.*;

/**
 * 
 */


public class AS_ASET_1403_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String ndduc_year;
	public String ndduc_prd_clsf;

	public AS_ASET_1403_LDM(){}
	public AS_ASET_1403_LDM(String cmpy_cd, String ndduc_year, String ndduc_prd_clsf){
		this.cmpy_cd = cmpy_cd;
		this.ndduc_year = ndduc_year;
		this.ndduc_prd_clsf = ndduc_prd_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setNdduc_year(String ndduc_year){
		this.ndduc_year = ndduc_year;
	}

	public void setNdduc_prd_clsf(String ndduc_prd_clsf){
		this.ndduc_prd_clsf = ndduc_prd_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getNdduc_year(){
		return this.ndduc_year;
	}

	public String getNdduc_prd_clsf(){
		return this.ndduc_prd_clsf;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_ASET_1403_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_ASET_1403_LDM dm = (AS_ASET_1403_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.ndduc_year);
		cstmt.setString(5, dm.ndduc_prd_clsf);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.aset.ds.AS_ASET_1403_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("ndduc_year = " + getNdduc_year());
        System.out.println("ndduc_prd_clsf = " + getNdduc_prd_clsf());
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
String ndduc_year = req.getParameter("ndduc_year");
if( ndduc_year == null){
	System.out.println(this.toString+" : ndduc_year is null" );
}else{
	System.out.println(this.toString+" : ndduc_year is "+ndduc_year );
}
String ndduc_prd_clsf = req.getParameter("ndduc_prd_clsf");
if( ndduc_prd_clsf == null){
	System.out.println(this.toString+" : ndduc_prd_clsf is null" );
}else{
	System.out.println(this.toString+" : ndduc_prd_clsf is "+ndduc_prd_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String ndduc_year = Util.checkString(req.getParameter("ndduc_year"));
String ndduc_prd_clsf = Util.checkString(req.getParameter("ndduc_prd_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String ndduc_year = Util.Uni2Ksc(Util.checkString(req.getParameter("ndduc_year")));
String ndduc_prd_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("ndduc_prd_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setNdduc_year(ndduc_year);
dm.setNdduc_prd_clsf(ndduc_prd_clsf);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Mar 17 19:21:27 KST 2009 */