/***************************************************************************************************
* 파일명 : .java
* 기능 : 거래처인물정보
* 작성일자 : 2010.07.16
* 작성자 : KBS
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
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
public class AD_BAS_3721_SDM extends somo.framework.db.BaseDM implements java.io.Serializable
{
	public String cmpy_cd;
	public String oth_clsf;
	public String pubc_dt;

	public AD_BAS_3721_SDM(){}
	
	public AD_BAS_3721_SDM(String cmpy_cd, String oth_clsf, String pubc_dt) {
		super();
		this.cmpy_cd = cmpy_cd;
		this.oth_clsf = oth_clsf;
		this.pubc_dt = pubc_dt;
	}

	public String getCmpy_cd() {
		return cmpy_cd;
	}

	public void setCmpy_cd(String cmpy_cd) {
		this.cmpy_cd = cmpy_cd;
	}	

	public String getPubc_dt() {
		return pubc_dt;
	}

	public void setPubc_dt(String pubc_dt) {
		this.pubc_dt = pubc_dt;
	}

	public String getOth_clsf() {
		return oth_clsf;
	}

	public void setOth_clsf(String oth_clsf) {
		this.oth_clsf = oth_clsf;
	}

	public String getSQL()
	{
		 return "{ call SP_AD_BAS_3721_S( ?, ?, ?, ?, ?, ?, ?, ? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException
	{
		AD_BAS_3721_SDM dm = (AD_BAS_3721_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.oth_clsf);
		cstmt.setString(5, dm.pubc_dt);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject()
	{
		return new chosun.ciis.ad.bas.ds.AD_BAS_3721_SDataSet();
	}

    public void print()
    {
        System.out.println("cmpy_cd = " + getCmpy_cd());
    }
}