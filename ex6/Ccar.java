public class Ccar {                    //�T�����O
    public double gas, tbo;            //�ŧi�̦h���o�q, �����Ӫo�q
	public double max_dist = 0;        //�[���o�i��p�̪��Z��

	public void MaxDist() {             //�p��i��p�̪��Z��
	    max_dist = gas * tbo;
	}

	public double Dist(double oil) {   //�@��[�o�i��p�Z��
	    return oil * tbo;
	}
}