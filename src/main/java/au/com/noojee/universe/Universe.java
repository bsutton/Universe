package au.com.noojee.universe;

public class Universe
{
	final double dAvogadroConstant		= 6.0226e23;		// Na	1/mol
	final double dMassOfProton			= 1.67239e-24;		// mp	grams
	final double dMassOfNeutron			= 1.67470e-24;		// mn	grams
	final double dMassOfElectron		= 9.1083e-28;		// me	grams
	final double dChargeOfProton		= 1.60206e-19;		// e	Coulombs (C)
	final double dFaradayConstant		= 96487;			// F	C/mol
	final double dBoltzmannConstant		= 1.3807e-23;		// k	J/K.
	final double dGasConstant			= 8.314;			// R	J/K/mol
	final double dPlanckConstant		= 6.626e-34;		// h	Js
	final double dSpeedOfLight			= 2.99793e8;		// c	m/s	(in a vacuum)
	final double dPermittivityOfVacuum	= 8.855e-12;		// Eo	C^2/J/m
	final double dGravity				= 9.81;				// g	m/s^2
	final double gGravitationConstant	= 6.672e-11;		// G	Nm^2/(kg^2)
	
	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[])
	{
		new Viewer().setVisible(true);
	}

		
}
