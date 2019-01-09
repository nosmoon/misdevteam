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


public class MT_COMMATR_1110_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String matr_cd;
	public String matr_nm;
	public String cmpy_cd;

	public MT_COMMATR_1110_LDM(){}
	public MT_COMMATR_1110_LDM(String matr_cd, String matr_nm, String cmpy_cd){
		this.matr_cd = matr_cd;
		this.matr_nm = matr_nm;
		this.cmpy_cd = cmpy_cd;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_COMMATR_1110_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_COMMATR_1110_LDM dm = (MT_COMMATR_1110_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.matr_cd);
		cstmt.setString(4, dm.matr_nm);
		cstmt.setString(5, dm.cmpy_cd);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.commatr.ds.MT_COMMATR_1110_LDataSet();
	}



    public void print(){
        System.out.println("matr_cd = " + getMatr_cd());
        System.out.println("matr_nm = " + getMatr_nm());
        System.out.println("cmpy_cd = " + getCmpy_cd());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String matr_cd = req.getParameter("matr_cd");
if( matr_cd == null){
	System.out.println(this.toString+" : matr_cd is null" );
}else{
	System.out.println(this.toString+" : matr_cd is "+matr_cd );
}
String matr_nm = req.getParameter("matr_nm");
if( matr_nm == null){
	System.out.println(this.toString+" : matr_nm is null" );
}else{
	System.out.println(this.toString+" : matr_nm is "+matr_nm );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String matr_cd = Util.checkString(req.getParameter("matr_cd"));
String matr_nm = Util.checkString(req.getParameter("matr_nm"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
String matr_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_nm")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setMatr_cd(matr_cd);
dm.setMatr_nm(matr_nm);
dm.setCmpy_cd(cmpy_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Mar 17 14:08:25 KST 2009 */