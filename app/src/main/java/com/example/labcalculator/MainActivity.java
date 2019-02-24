package com.example.labcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    //Declaration
    Button bReset1, bReset2, bReset3, bCalculate1, bCalculate2, bCalculate3;
    EditText eMeters, eInches, eFeet, eYards, eMiles, eNauticalMiles, eKilograms, eOunces, ePounds, eTroyPounds, eStones, eShortTons, eLongTons,eLiters, eFluidOunces, eQuarts, eGallons, eImperialGallons;
   double Meters, Inches, Feet, Yards, Miles, NauticalMiles, Kilograms, Ounces, Pounds, TroyPounds, Stones,ShortTons, LongTons, Liters,FluidOunces, Quarts, Gallons, ImperialGallons;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eMeters = (EditText) findViewById(R.id.editMeters);
        eInches = (EditText) findViewById(R.id.editInches);
        eFeet = (EditText) findViewById(R.id.editFeet);
        eYards = (EditText) findViewById(R.id.editYards);
        eMiles = (EditText) findViewById(R.id.editMiles);
        eNauticalMiles = (EditText) findViewById(R.id.editNauticalMiles);

        eKilograms = (EditText) findViewById(R.id.editKilograms);
        eOunces = (EditText) findViewById(R.id.editOunces);
        ePounds = (EditText) findViewById(R.id.editPounds);
        eTroyPounds = (EditText) findViewById(R.id.editTroyPounds);
        eStones = (EditText) findViewById(R.id.editStones);
        eShortTons = (EditText) findViewById(R.id.editShortTons);
        eLongTons = (EditText) findViewById(R.id.editLongTons);

        eLiters = (EditText) findViewById(R.id.editLiters);
        eFluidOunces = (EditText) findViewById(R.id.editFluidOunces);
        eQuarts = (EditText) findViewById(R.id.editQuarts);
        eGallons = (EditText) findViewById(R.id.editGallons);
        eImperialGallons = (EditText) findViewById(R.id.editImperialGallons);

        bReset1 = findViewById(R.id.btnReset1);
        bReset2 = findViewById(R.id.btnReset2);
        bReset3 = findViewById(R.id.btnReset3);

        bCalculate1 = findViewById(R.id.btnCalculate1);
        bCalculate2 = findViewById(R.id.btnCalculate2);
        bCalculate3 =findViewById(R.id.btnCalculate3);



        bCalculate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (eMeters.isFocused()) {

                    Meters = Double.parseDouble(eMeters.getText().toString());
                    double Inches = Meters * 39.370079;
                    double Feet = Meters * 3.28084;
                    double Yards = Meters * 1.093613;
                    double Miles = Meters / 1609.344;
                    double NauticalMiles = Meters / 1852;

                    eInches.setText("" + Inches);
                    eFeet.setText("" + Feet);
                    eYards.setText("" + Yards);
                    eMiles.setText("" + Miles);
                    eNauticalMiles.setText("" + NauticalMiles);


                } else if (eInches.isFocused()) {

                    Inches = Double.valueOf(eInches.getText().toString());

                    double Meters = Inches * 0.0254;
                    double Feet = Inches / 12;
                    double Yards = Inches * 0.027778;
                    double Miles = Inches * 1.5783E-5;
                    double NauticalMiles = Inches / 72913.386;

                    eMeters.setText("" + Meters);
                    eInches.setText("" + Inches);
                    eFeet.setText("" + Feet);
                    eYards.setText("" + Yards);
                    eMiles.setText("" + Miles);
                    eNauticalMiles.setText("" + NauticalMiles);


                } else if (eFeet.isFocused()) {

                    Feet = Double.parseDouble(eFeet.getText().toString());

                    double Meters = Feet * 0.3048;
                    double Inches = Feet * 12;
                    double Yards = Feet * 0.333333;
                    double Miles = Feet * 0.000189;
                    double NauticalMiles = Feet / 6076.115;

                    eMeters.setText("" + Meters);
                    eInches.setText("" + Inches);
                    eYards.setText("" + Yards);
                    eMiles.setText("" + Miles);
                    eNauticalMiles.setText("" + NauticalMiles);


                } else if (eYards.isFocused()) {

                    Yards = Double.parseDouble(eYards.getText().toString());

                    double Meters = Yards * 0.9144;
                    double Inches = Yards * 36;
                    double Feet = Yards * 3;
                    double Miles = Yards * 0.000568;
                    double NauticalMiles = Yards / 2025.372;

                    eMeters.setText("" + Meters);
                    eInches.setText("" + Inches);
                    eFeet.setText("" + Feet);
                    eMiles.setText("" + Miles);
                    eNauticalMiles.setText("" + NauticalMiles);


                } else if (eMiles.isFocused()) {

                    Miles = Double.parseDouble(eMiles.getText().toString());
                    double Meters = Miles * 1609.344;
                    double Inches = Miles * 63360;
                    double Feet = Miles * 5280;
                    double Yards = Miles * 1760;
                    double NauticalMiles = Miles / 1.151;

                    eMeters.setText("" + Meters);
                    eInches.setText("" + Inches);
                    eFeet.setText("" + Feet);
                    eYards.setText("" + Yards);
                    eNauticalMiles.setText("" + NauticalMiles);


                } else if (eNauticalMiles.isFocused()) {

                    NauticalMiles = Double.valueOf(eNauticalMiles.getText().toString());

                    double Meters = NauticalMiles * 1852;
                    double Inches = NauticalMiles * 72913.386;
                    double Feet = NauticalMiles * 6076.115;
                    double Yards = NauticalMiles * 2025.372;
                    double Miles = NauticalMiles * 1.151;


                    eMeters.setText("" + Meters);
                    eInches.setText("" + Inches);
                    eFeet.setText("" + Feet);
                    eYards.setText("" + Yards);
                    eMiles.setText("" + Miles);


                }

            }
                                       }
        );

        bReset1.setOnClickListener(new View.OnClickListener() {
                                    @Override

                                    public void onClick(View v) {

                                        eMeters.getText().clear();
                                        eInches.getText().clear();
                                        eFeet.getText().clear();
                                        eYards.getText().clear();
                                        eMiles.getText().clear();
                                        eNauticalMiles.getText().clear();
                                    }
                                }
        );

        bCalculate2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if (eKilograms.isFocused()) {

                                            Kilograms= Double.parseDouble(eKilograms.getText().toString());

                                            double Ounces = Kilograms * 35.273962;
                                            double Pounds=  Kilograms * 2.204623;
                                            double TroyPounds=  Kilograms * 2.6792;
                                            double Stones =  Kilograms / 6.35;
                                            double ShortTons = Kilograms / 907.185;
                                            double LongTons = Kilograms / 1016.047;

                                            eOunces.setText(""+Ounces);
                                            ePounds.setText(""+Pounds);
                                            eTroyPounds.setText(""+TroyPounds);
                                            eStones.setText(""+Stones);
                                            eShortTons.setText(""+ShortTons);
                                            eLongTons.setText(""+LongTons);


                                        } else if (eOunces.isFocused()) {

                                            Ounces = Double.parseDouble(eOunces.getText().toString());


                                            double Kilograms =Ounces * 0.02835;
                                            double Pounds= Ounces  * 0.0625;
                                            double TroyPounds= Ounces  * 0.083333;
                                            double Stones =  Ounces  / 224;
                                            double ShortTons = Ounces  / 32000;
                                            double LongTons = Ounces  / 35840;

                                            eKilograms.setText(""+Kilograms);
                                            ePounds.setText(""+Pounds);
                                            eTroyPounds.setText(""+TroyPounds);
                                            eStones.setText(""+Stones);
                                            eShortTons.setText(""+ShortTons);
                                            eLongTons.setText(""+LongTons);





                                        } else if (ePounds.isFocused()) {

                                            Pounds = Double.valueOf(ePounds.getText().toString());

                                            double Kilograms =Pounds * 0.453592;
                                            double Ounces=  Pounds * 16;
                                            double TroyPounds= Pounds * 1.2153;
                                            double Stones = Pounds / 14;
                                            double ShortTons =Pounds/ 2000;
                                            double LongTons = Pounds/ 2240;

                                            eKilograms.setText(""+Kilograms);
                                            eOunces.setText(""+Ounces);
                                            eTroyPounds.setText(""+TroyPounds);
                                            eStones.setText(""+Stones);
                                            eShortTons.setText(""+ShortTons);
                                            eLongTons.setText(""+LongTons);


                                        } else if (eTroyPounds.isFocused()) {

                                            TroyPounds = Double.valueOf(eTroyPounds.getText().toString());

                                            double Kilograms =TroyPounds / 2.6792;
                                            double Ounces=  TroyPounds * 13.166;
                                            double Pounds= TroyPounds * 0.82286 ;
                                            double Stones = TroyPounds * 0.058776 ;
                                            double ShortTons =TroyPounds * 0.00041143 ;
                                            double LongTons = TroyPounds * 0.00036735;


                                            eKilograms.setText(""+Kilograms);
                                            eOunces.setText(""+Ounces);
                                            ePounds.setText(""+Pounds);
                                            eStones.setText(""+Stones);
                                            eShortTons.setText(""+ShortTons);
                                            eLongTons.setText(""+LongTons);


                                        } else if (eStones.isFocused()) {

                                            double Kilograms =Stones * 6.35;
                                            double Ounces=  Stones* 224;
                                            double Pounds= Stones * 14 ;
                                            double TroyPounds =  Stones* 17.014 ;
                                            double ShortTons = Stones* 142.857 ;
                                            double LongTons = Stones / 160;


                                            eKilograms.setText(""+Kilograms);
                                            eOunces.setText(""+Ounces);
                                            ePounds.setText(""+Pounds);
                                            eTroyPounds.setText(""+TroyPounds);
                                            eShortTons.setText(""+ShortTons);
                                            eLongTons.setText(""+LongTons);



                                        } else if (eShortTons.isFocused()) {

                                            ShortTons = Double.valueOf(eShortTons.getText().toString());

                                            double Kilograms =ShortTons * 907.185;
                                            double Ounces= ShortTons * 32000;
                                            double Pounds=  ShortTons* 2000;
                                            double TroyPounds = ShortTons * 2430.6 ;
                                            double Stones = ShortTons* 142.857;
                                            double LongTons = ShortTons / 1.12;


                                            eKilograms.setText(""+Kilograms);
                                            eOunces.setText(""+Ounces);
                                            ePounds.setText(""+Pounds);
                                            eTroyPounds.setText(""+TroyPounds);
                                            eStones.setText(""+Stones);
                                            eLongTons.setText(""+LongTons);

                                        } else if (eLongTons.isFocused()) {

                                            LongTons = Double.valueOf(eLongTons.getText().toString());

                                            double Kilograms =LongTons * 1016.047;
                                            double Ounces= LongTons * 35840;
                                            double Pounds=  LongTons* 2240;
                                            double TroyPounds = LongTons * 2722.2 ;
                                            double Stones = LongTons* 160.00;
                                            double ShortTons = LongTons * 1.12;

                                            eKilograms.setText(""+Kilograms);
                                            eOunces.setText(""+Ounces);
                                            ePounds.setText(""+Pounds);
                                            eTroyPounds.setText(""+TroyPounds);
                                            eStones.setText(""+Stones);
                                            eShortTons.setText(""+ShortTons);



                                        }

                                    }
                                       }
        );


        bReset2.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {

                                           eKilograms.getText().clear();
                                           eOunces.getText().clear();
                                           ePounds.getText().clear();
                                           eTroyPounds.getText().clear();
                                           eStones.getText().clear();
                                           eShortTons.getText().clear();
                                           eLongTons.getText().clear();
                                       }
                                   }
        );


        bCalculate3.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               if (eLiters.isFocused()) {

                                                   Liters = Double.valueOf(eLiters.getText().toString());

                                                   double FluidOunces =Liters * 33.814023;
                                                   double Quarts= Liters * 1.056688;
                                                   double Gallons=  Liters* 0.264172;
                                                   double ImperialGallons = Liters / 4546 ;

                                                   eFluidOunces.setText(""+FluidOunces);
                                                   eQuarts.setText(""+Quarts);
                                                   eGallons.setText(""+Gallons);
                                                   eImperialGallons.setText(""+ImperialGallons);




                                               } else if (eFluidOunces.isFocused()) {

                                                   FluidOunces = Double.valueOf(eFluidOunces.getText().toString());

                                                   double Liters =FluidOunces * 0.029574;
                                                   double Quarts=  FluidOunces* 0.03125;
                                                   double Gallons= FluidOunces * 0.07812;
                                                   double ImperialGallons = FluidOunces/ 153.722 ;

                                                   eLiters.setText(""+Liters);
                                                   eQuarts.setText(""+Quarts);
                                                   eGallons.setText(""+Gallons);
                                                   eImperialGallons.setText(""+ImperialGallons);







                                               } else if (eQuarts.isFocused()) {

                                                   Quarts = Double.valueOf(eQuarts.getText().toString());

                                                   double Liters =Quarts* 0.946353;
                                                   double FluidOunces= Quarts * 32;
                                                   double Gallons= Quarts * 0.25;
                                                   double ImperialGallons = Quarts/ 4.804 ;


                                                   eFluidOunces.setText(""+FluidOunces);
                                                   eLiters.setText(""+Liters);
                                                   eGallons.setText(""+Gallons);
                                                   eImperialGallons.setText(""+ImperialGallons);



                                               } else if (eGallons.isFocused()) {

                                                   Gallons = Double.valueOf(eGallons.getText().toString());

                                                   double Liters =Gallons* 03.785412;
                                                   double FluidOunces= Gallons * 128;
                                                   double Quarts= Gallons * 4;
                                                   double ImperialGallons = Gallons/ 1.201 ;

                                                   eLiters.setText(""+Liters);
                                                   eFluidOunces.setText(""+FluidOunces);
                                                   eQuarts.setText(""+Quarts);
                                                   eImperialGallons.setText(""+ImperialGallons);




                                               } else if (eImperialGallons.isFocused()) {

                                                   ImperialGallons = Double.valueOf(eImperialGallons.getText().toString());

                                                   double Liters =ImperialGallons* 4.546;
                                                   double FluidOunces= ImperialGallons *153.722;
                                                   double Quarts=  ImperialGallons* 4.804;
                                                   double Gallons=  ImperialGallons* 1.201;

                                                   eLiters.setText(""+Liters);
                                                   eFluidOunces.setText(""+FluidOunces);
                                                   eQuarts.setText(""+Quarts);
                                                   eGallons.setText(""+Gallons);





                                               }

                                           }
                                       }
        );

        bReset3.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {

                                           eLiters.getText().clear();
                                           eFluidOunces.getText().clear();
                                           eQuarts.getText().clear();
                                           eGallons.getText().clear();
                                           eImperialGallons.getText().clear();

                                       }
                                   }
        );





    }
}
