package com.example.iniciarsesion;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

public class PlantaAdaptador extends ArrayAdapter<Planta> {

    public PlantaAdaptador(Context context, List<Planta> plantas) {
        super(context, 0, plantas);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Planta planta = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.planta_item, parent, false);
        }

        TextView tvNombreComun = convertView.findViewById(R.id.tvNombreComun);
        TextView tvNombreCientifico = convertView.findViewById(R.id.tvNombreCientifico);
        TextView tvTipoPlanta = convertView.findViewById(R.id.tvTipoPlanta);
        TextView tvCategoria = convertView.findViewById(R.id.tvCategoria);
        TextView tvInformacionAdicional = convertView.findViewById(R.id.tvInformacionAdicional);

        tvNombreComun.setText(planta.getNombreComun());
        tvNombreCientifico.setText(planta.getNombreCientifico());
        tvTipoPlanta.setText(planta.getTipoPlanta());
        tvCategoria.setText(planta.getCategoria());
        tvInformacionAdicional.setText(planta.getInformacionAdicional());

        return convertView;
    }
}
