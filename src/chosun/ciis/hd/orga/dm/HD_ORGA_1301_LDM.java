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


package chosun.ciis.hd.orga.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.orga.ds.*;
import chosun.ciis.hd.orga.rec.*;

/**
 * 
 */


public class HD_ORGA_1301_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dept_cd;
	public String orga_reorga_dd;

	public HD_ORGA_1301_LDM(){}
	public HD_ORGA_1301_LDM(String cmpy_cd, String dept_cd, String orga_reorga_dd){
		this.cmpy_cd = cmpy_cd;
		this.dept_cd = dept_cd;
		this.orga_reorga_dd = orga_reorga_dd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setOrga_reorga_dd(String orga_reorga_dd){
		this.orga_reorga_dd = orga_reorga_dd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getOrga_reorga_dd(){
		return this.orga_reorga_dd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_ORGA_1301_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_ORGA_1301_LDM dm = (HD_ORGA_1301_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dept_cd);
		cstmt.setString(5, dm.orga_reorga_dd);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.orga.ds.HD_ORGA_1301_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("dept_cd = " + getDept_cd());
        System.out.println("orga_reorga_dd = " + getOrga_reorga_dd());
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
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String orga_reorga_dd = req.getParameter("orga_reorga_dd");
if( orga_reorga_dd == null){
	System.out.println(this.toString+" : orga_reorga_dd is null" );
}else{
	System.out.println(this.toString+" : orga_reorga_dd is "+orga_reorga_dd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String orga_reorga_dd = Util.checkString(req.getParameter("orga_reorga_dd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String orga_reorga_dd = Util.Uni2Ksc(Util.checkString(req.getParameter("orga_reorga_dd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setDept_cd(dept_cd);
dm.setOrga_reorga_dd(orga_reorga_dd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Mar 17 13:45:43 KST 2009 */